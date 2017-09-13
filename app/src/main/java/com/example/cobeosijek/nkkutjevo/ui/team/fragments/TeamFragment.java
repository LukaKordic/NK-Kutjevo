package com.example.cobeosijek.nkkutjevo.ui.team.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.RealmUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.player_model.PlayerModel;
import com.example.cobeosijek.nkkutjevo.ui.team.activities.PlayerDetailsActivity;
import com.example.cobeosijek.nkkutjevo.ui.team.adapters.TeamRecyclerViewAdapter;
import com.example.cobeosijek.nkkutjevo.ui.team.listeners.ItemClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamFragment extends Fragment implements ItemClickListener {

    @BindView(R.id.team_recycler_view)
    RecyclerView teamRecyclerView;

    private final TeamRecyclerViewAdapter teamRecyclerViewAdapter = new TeamRecyclerViewAdapter();

    public static TeamFragment newInstance() {
        return new TeamFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_team, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        teamRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        teamRecyclerView.setItemAnimator(new DefaultItemAnimator());

        teamRecyclerViewAdapter.setItemClickListener(this);
        teamRecyclerView.setAdapter(teamRecyclerViewAdapter);
        teamRecyclerViewAdapter.setPlayerModelList(RealmUtils.loadPlayers());
    }

    @Override
    public void onItemClick(PlayerModel playerModel) {
        startActivity(PlayerDetailsActivity.getLaunchIntent(getActivity(), playerModel));
    }
}
