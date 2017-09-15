package com.example.cobeosijek.nkkutjevo.ui.schedule.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.BuildConfig;
import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.DummyDataFactory;
import com.example.cobeosijek.nkkutjevo.common.utils.DataUtils;
import com.example.cobeosijek.nkkutjevo.common.utils.FirebaseUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.GameModel;
import com.example.cobeosijek.nkkutjevo.ui.schedule.adapters.GamesAdapter;
import com.example.cobeosijek.nkkutjevo.ui.schedule.adapters.RankingRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScheduleFragment extends Fragment implements ValueEventListener {

    @BindView(R.id.ranking_recycler_view)
    RecyclerView rankingRecyclerView;

    @BindView(R.id.games_recycler)
    RecyclerView gamesRecyclerView;

    List<GameModel> gamesList = new ArrayList<>();
    List<GameModel> notPlayedList = new ArrayList<>();

    private final RankingRecyclerAdapter rankingRecyclerAdapter = new RankingRecyclerAdapter();
    private final GamesAdapter gamesAdapter = new GamesAdapter();

    public static ScheduleFragment newInstance() {
        return new ScheduleFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

        DataUtils.sortByDate(notPlayedList);
        initRankingRecyclerView();
        FirebaseUtils.getDatabaseReference().addValueEventListener(this);
    }

    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        for (DataSnapshot child : dataSnapshot.getChildren()) {
            GameModel kolo = child.getValue(GameModel.class);
            if (kolo != null) {
                gamesList.add(kolo);
            }
        }

        DataUtils.sortByDate(gamesList);
        initGamesRecyclerView(gamesList);
    }

    private void initRankingRecyclerView() {
        rankingRecyclerAdapter.setTeamModelList(DummyDataFactory.getteamModelList());
        rankingRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        rankingRecyclerView.setItemAnimator(new DefaultItemAnimator());
        rankingRecyclerView.setAdapter(rankingRecyclerAdapter);
    }

    private void initGamesRecyclerView(List<GameModel> gameList) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        gamesAdapter.setGameModelList(gameList);
        gamesRecyclerView.setLayoutManager(linearLayoutManager);
        gamesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        DividerItemDecoration decoration = new DividerItemDecoration(getContext(), linearLayoutManager.getOrientation());
        gamesRecyclerView.addItemDecoration(decoration);
        gamesRecyclerView.addItemDecoration(decoration);

        gamesRecyclerView.setAdapter(gamesAdapter);
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {
        if (BuildConfig.DEBUG) {
            Log.d("DatabaseError", "onCancelled: " + databaseError.toString());
        }
    }
}
