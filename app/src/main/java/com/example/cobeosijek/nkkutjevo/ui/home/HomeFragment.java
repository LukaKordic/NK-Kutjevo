package com.example.cobeosijek.nkkutjevo.ui.home;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.Constants;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment implements FacebookCallback<LoginResult> {

    private final CallbackManager callbackManager = CallbackManager.Factory.create();
    @BindView(R.id.home_team_image)
    ImageView homeTeamImage;
    @BindView(R.id.away_team_image)
    ImageView awayTeamImage;

    public static HomeFragment newInstance() {
        HomeFragment homeFragment = new HomeFragment();

        Bundle args = new Bundle();
        homeFragment.setArguments(args);
        return homeFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

        initUI();
        initLoginManager();

        String[] permissions = {Constants.PERMISSION};

        if (AccessToken.getCurrentAccessToken() == null) {
            initLoginManager().logInWithReadPermissions(this, Arrays.asList(permissions));
        } else {
            requestFeed(AccessToken.getCurrentAccessToken());
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }


    @Override
    public void onSuccess(LoginResult loginResult) {
        if (loginResult != null) {
            requestFeed(loginResult.getAccessToken());
        }
        Toast.makeText(getActivity().getApplicationContext(), Constants.LOGED_IN, Toast.LENGTH_SHORT).show();
    }

    private void initUI() {
        //TODO promjeniti slike ovisno o sljedecoj utakmici
        ImageUtils.loadSmallImage(homeTeamImage, "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/10441379_571895542965504_3234583505345128658_n.png?oh=11d1085d86cce18414fec4ec47e2932b&oe=5A0575DA");
        ImageUtils.loadSmallImage(awayTeamImage, "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/14572918_1823586701212015_4927312342681512458_n.jpg?oh=a9b9f91beec61584290fc2bed2a9811d&oe=59FC0AE8");
    }

    private LoginManager initLoginManager() {
        LoginManager loginManager = LoginManager.getInstance();
        loginManager.registerCallback(callbackManager, this);
        return loginManager;
    }

    private void requestFeed(AccessToken token) {
        GraphRequest request = GraphRequest.newGraphPathRequest(token,
                "/NKKutjevo/feed",
                new GraphRequest.Callback() {
                    @Override
                    public void onCompleted(GraphResponse response) {
                        // TODO: 01/08/2017 implement GSON parsing
                        //end product
                        Log.d("Test", response.toString());
                    }
                });

        Bundle parameters = new Bundle();
        parameters.putString("fields", "id,name,full_picture,story");
        request.setParameters(parameters);
        request.executeAsync();
    }

    @Override
    public void onCancel() {
        //ok nothing
    }

    @Override
    public void onError(FacebookException error) {
        Toast.makeText(getActivity().getApplicationContext(), Constants.ERROR + error.toString(), Toast.LENGTH_SHORT).show();
    }
}
