package com.example.cobeosijek.nkkutjevo.ui.team.fragments;


import android.content.Intent;
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
import com.example.cobeosijek.nkkutjevo.common.utils.Constants;
import com.example.cobeosijek.nkkutjevo.common.utils.DataUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;
import com.example.cobeosijek.nkkutjevo.ui.team.activities.PlayerDetailsActivity;
import com.example.cobeosijek.nkkutjevo.ui.team.adapters.TeamRecyclerViewAdapter;
import com.example.cobeosijek.nkkutjevo.ui.team.listeners.ItemClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamFragment extends Fragment implements ItemClickListener {

    private final TeamRecyclerViewAdapter teamRecyclerViewAdapter = new TeamRecyclerViewAdapter();

    @BindView(R.id.team_recycler_view)
    RecyclerView teamRecyclerView;

    public static TeamFragment newInstance() {
        TeamFragment teamFragment = new TeamFragment();

        Bundle args = new Bundle();
        teamFragment.setArguments(args);
        return teamFragment;
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
        teamRecyclerViewAdapter.setPlayerList(DataUtils.loadPlayers(view.getContext()));
    }

    @Override
    public void onItemClick(Player player) {
        Intent intent = new Intent(getActivity(), PlayerDetailsActivity.class);
        intent.putExtra(Constants.KEY_PLAYER, player);
        startActivity(intent);
    }
}
