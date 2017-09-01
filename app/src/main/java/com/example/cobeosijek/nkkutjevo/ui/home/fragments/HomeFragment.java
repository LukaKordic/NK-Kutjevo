package com.example.cobeosijek.nkkutjevo.ui.home.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cobeosijek.nkkutjevo.App;
import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.Constants;
import com.example.cobeosijek.nkkutjevo.common.utils.DatabaseUtils;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.GameModel;
import com.example.cobeosijek.nkkutjevo.data_objects.reponses.FeedResponse;
import com.example.cobeosijek.nkkutjevo.ui.home.PagerClickListener;
import com.example.cobeosijek.nkkutjevo.ui.home.activities.MapsActivity;
import com.example.cobeosijek.nkkutjevo.ui.home.activities.ReadPostActivity;
import com.example.cobeosijek.nkkutjevo.ui.home.adapters.HomePagerAdapter;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeFragment extends Fragment implements FacebookCallback<LoginResult>, PagerClickListener, ValueEventListener {

    @BindView(R.id.home_view_pager)
    ViewPager homeViewPager;

    @BindView(R.id.home_team_image)
    ImageView homeTeamImage;

    @BindView(R.id.away_team_image)
    ImageView awayTeamImage;

    private final HomePagerAdapter homePagerAdapter = new HomePagerAdapter();
    private final CallbackManager callbackManager = CallbackManager.Factory.create();

    private FeedResponse fbResponse;
    private List<String> imageList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initUI(view);
        registerCallback();
        checkIfTokenExists();
        getDatabaseReference().addValueEventListener(this);
    }

    private void initUI(View view) {
        ButterKnife.bind(this, view);
        homePagerAdapter.setPagerClickListener(this);
        homeViewPager.setAdapter(homePagerAdapter);
    }

    private void registerCallback() {
        LoginManager loginManager = LoginManager.getInstance();
        loginManager.registerCallback(callbackManager, this);
    }

    private void checkIfTokenExists() {
        String[] permissions = {Constants.PERMISSION};
        if (AccessToken.getCurrentAccessToken() == null) {
            LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList(permissions));
        } else {
            requestFeed(AccessToken.getCurrentAccessToken());
        }
    }

    private DatabaseReference getDatabaseReference() {
        return App.getFirebaseDb().getReference();
    }

    private Date getCurrentDate() {
        return new Date();
    }

    private void setResponse() {
        homePagerAdapter.setResponse(DatabaseUtils.loadFeedResponse());
    }

    private void setData() {
        homePagerAdapter.setData(imageList, titleList);
    }

    //Facebook login
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    //if successfull, return token
    @Override
    public void onSuccess(LoginResult loginResult) {
        if (loginResult != null) {
            requestFeed(loginResult.getAccessToken());
        }
        Toast.makeText(App.get(), Constants.LOGED_IN, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCancel() {
        //ok nothing
    }

    @Override
    public void onError(FacebookException error) {
        Toast.makeText(App.get(), Constants.ERROR + error.toString(), Toast.LENGTH_SHORT).show();
    }

    private void requestFeed(AccessToken token) {
        GraphRequest request = GraphRequest.newGraphPathRequest(token,
                "/NKKutjevo/feed",
                new GraphRequest.Callback() {
                    @Override
                    public void onCompleted(GraphResponse response) {
                        fbResponse = parseJsonResponse(createGsonParser(), response);
                        if (fbResponse != null) {
                            DatabaseUtils.saveResponseIntoRealm(fbResponse);
                            setResponse();
                            for (int i = 0; i < 3; i++) {
                                imageList.add(DatabaseUtils.loadFeedResponse().getData().get(i).getFullPicture());
                                titleList.add(DatabaseUtils.loadFeedResponse().getData().get(i).getName());
                            }
                            setData();
                        }
                    }
                });

        Bundle parameters = new Bundle();
        parameters.putString("fields", "id,name, full_picture, message");
        request.setParameters(parameters);
        request.executeAsync();
    }

    private Gson createGsonParser() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting().serializeNulls();
        return gsonBuilder.create();
    }

    private FeedResponse parseJsonResponse(Gson gson, GraphResponse response) {
        return gson.fromJson(response.getRawResponse(), FeedResponse.class);
    }

    @Override
    public void onItemClick(int position) {
        startActivity(ReadPostActivity.getLaunchIntent(getActivity(), position));
    }

    @OnClick(R.id.map_button)
    public void showMap() {
        Intent intent = new Intent(getActivity(), MapsActivity.class);
        startActivity(intent);
    }

    private void loadNextGameImages(String homeLogo, String awayLogo) {
        ImageUtils.loadSmallImage(homeTeamImage, homeLogo);
        ImageUtils.loadSmallImage(awayTeamImage, awayLogo);
    }

    //retrieve data from firebase
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        List<GameModel> gamesList = new ArrayList<>();
        List<GameModel> notPlayedList = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        for (DataSnapshot child : dataSnapshot.getChildren()) {
            GameModel kolo = child.getValue(GameModel.class);
            if (kolo != null) {
                gamesList.add(kolo);
            }
        }

        //utils
        for (GameModel model : gamesList) {
            try {
                Date date = dateFormat.parse(model.getDate());
                if (date.after(getCurrentDate())) {
                    notPlayedList.add(model);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        try {
            findNextGame(notPlayedList);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private void findNextGame(List<GameModel> notPlayedList) throws ParseException {
        DateFormat format = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());
        GameModel nextGame = new GameModel("Bsk Buk", "Nk Kutjevo", "03.09.2017.", "Buk", "https://scontent-frt3-2.xx.fbcdn.net/v/t1.0-9/12728767_1568213763495767_7717841912992333193_n.jpg?oh=df25752965526ab98241ba70514f70bc&oe=5A19D855", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/10441379_571895542965504_3234583505345128658_n.png?oh=11d1085d86cce18414fec4ec47e2932b&oe=5A0575DA");

        for (GameModel game : notPlayedList) {
            if (format.parse(game.getDate()).before(format.parse(nextGame.getDate()))) {
                nextGame = game;
            }
        }
        loadNextGameImages(nextGame.getHomeLogo(), nextGame.getAwayLogo());
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {
        Log.d("DatabaseError", "onCancelled: " + databaseError.toString());
    }
}
