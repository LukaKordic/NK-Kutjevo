package com.example.cobeosijek.nkkutjevo.ui.home;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

        initUI();
    }

    private void initUI() {
        ImageUtils.loadSmallImage(homeTeamImage, "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/10441379_571895542965504_3234583505345128658_n.png?oh=11d1085d86cce18414fec4ec47e2932b&oe=5A0575DA");
        ImageUtils.loadSmallImage(awayTeamImage, "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/14572918_1823586701212015_4927312342681512458_n.jpg?oh=a9b9f91beec61584290fc2bed2a9811d&oe=59FC0AE8");
    }
}
