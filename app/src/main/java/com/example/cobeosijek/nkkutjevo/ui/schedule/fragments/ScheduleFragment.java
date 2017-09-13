package com.example.cobeosijek.nkkutjevo.ui.schedule.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.BuildConfig;
import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.Constants;
import com.example.cobeosijek.nkkutjevo.common.DummyDataFactory;
import com.example.cobeosijek.nkkutjevo.common.utils.DataUtils;
import com.example.cobeosijek.nkkutjevo.common.utils.FirebaseUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.GameModel;
import com.example.cobeosijek.nkkutjevo.ui.schedule.adapters.GamesAdapter;
import com.example.cobeosijek.nkkutjevo.ui.schedule.adapters.RankingRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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
        DateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        for (DataSnapshot child : dataSnapshot.getChildren()) {
            GameModel kolo = child.getValue(GameModel.class);
            if (kolo != null) {
                gamesList.add(kolo);
            }
        }

        for (GameModel model : gamesList) {
            try {
                Date date = dateFormat.parse(model.getDate());
                if (date.after(getCurrentDate())) {
                    notPlayedList.add(model);
                }
            } catch (ParseException e) {
                if (BuildConfig.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
        DataUtils.sortByDate(notPlayedList);
        initGamesRecyclerView(notPlayedList);
    }

    private void initRankingRecyclerView() {
        rankingRecyclerAdapter.setTeamModelList(DummyDataFactory.getteamModelList());
        rankingRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        rankingRecyclerView.setItemAnimator(new DefaultItemAnimator());
        rankingRecyclerView.setAdapter(rankingRecyclerAdapter);
    }

    private void initGamesRecyclerView(List<GameModel> gameList) {
        gamesAdapter.setGameModelList(gameList);
        gamesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        gamesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        gamesRecyclerView.setAdapter(gamesAdapter);
    }

    private Date getCurrentDate() {
        return new Date();
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {
        if (BuildConfig.DEBUG) {
            Log.d("DatabaseError", "onCancelled: " + databaseError.toString());
        }
    }
}
