package com.example.cobeosijek.nkkutjevo.ui.schedule.fragments;


import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.helpers.DataHelper;
import com.example.cobeosijek.nkkutjevo.ui.schedule.adapters.RankingRecyclerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ScheduleFragment extends Fragment {

    private final RankingRecyclerAdapter rankingRecyclerAdapter = new RankingRecyclerAdapter();

    @BindView(R.id.ranking_recycler_view)
    RecyclerView rankingRecyclerView;

    public static ScheduleFragment newInstance() {
        ScheduleFragment scheduleFragment = new ScheduleFragment();

        Bundle args = new Bundle();
        scheduleFragment.setArguments(args);
        return scheduleFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_schedule, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

        initRecyclerView(view);
    }

    private void initRecyclerView(View view) {
        rankingRecyclerAdapter.setTeamModelList(DataHelper.getteamModelList());
        rankingRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rankingRecyclerView.setItemAnimator(new DefaultItemAnimator());
        rankingRecyclerView.setAdapter(rankingRecyclerAdapter);
    }
}
