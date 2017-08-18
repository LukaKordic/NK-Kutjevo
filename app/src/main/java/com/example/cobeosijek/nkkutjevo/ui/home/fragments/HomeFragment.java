package com.example.cobeosijek.nkkutjevo.ui.home.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cobeosijek.nkkutjevo.App;
import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.Constants;
import com.example.cobeosijek.nkkutjevo.common.utils.DatabaseUtils;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
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
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeFragment extends Fragment implements FacebookCallback<LoginResult>, PagerClickListener {

    @BindView(R.id.home_view_pager)
    ViewPager homeViewPager;

    @BindView(R.id.home_team_image)
    ImageView homeTeamImage;

    @BindView(R.id.away_team_image)
    ImageView awayTeamImage;

    @BindView(R.id.map_button)
    Button mapButton;

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
    }

    private void initUI(View view) {
        ButterKnife.bind(this, view);
        homePagerAdapter.setPagerClickListener(this);
        homeViewPager.setAdapter(homePagerAdapter);
        loadImagesForNextGame();
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

    private void setResponse() {
        homePagerAdapter.setResponse(fbResponse);
    }

    private void setData() {
        homePagerAdapter.setData(imageList, titleList);
    }

    private void loadImagesForNextGame() {
        ImageUtils.loadSmallImage(homeTeamImage, "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/10441379_571895542965504_3234583505345128658_n.png?oh=11d1085d86cce18414fec4ec47e2932b&oe=5A0575DA");
        ImageUtils.loadSmallImage(awayTeamImage, "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/14572918_1823586701212015_4927312342681512458_n.jpg?oh=a9b9f91beec61584290fc2bed2a9811d&oe=59FC0AE8");
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
                        DatabaseUtils.saveResponseIntoRealm(fbResponse);
                        setResponse();
                        for (int i = 0; i < 3; i++) {
                            imageList.add(fbResponse.getData().get(i).getFullPicture());
                            titleList.add(fbResponse.getData().get(i).getName());
                        }
                        setData();
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
    public void showMap(){
        Intent intent = new Intent(getActivity(), MapsActivity.class);
        startActivity(intent);
    }
}
