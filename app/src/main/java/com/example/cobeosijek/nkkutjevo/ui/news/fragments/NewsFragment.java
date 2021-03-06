package com.example.cobeosijek.nkkutjevo.ui.news.fragments;


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
import com.example.cobeosijek.nkkutjevo.ui.home.PagerClickListener;
import com.example.cobeosijek.nkkutjevo.ui.home.activities.ReadPostActivity;
import com.example.cobeosijek.nkkutjevo.ui.news.adapters.NewsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsFragment extends Fragment implements PagerClickListener {

    @BindView(R.id.news_recycler_view)
    RecyclerView newsRecyclerView;

    private final NewsAdapter newsAdapter = new NewsAdapter();

    public static NewsFragment newInstance() {
        return new NewsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        newsRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        newsRecyclerView.setItemAnimator(new DefaultItemAnimator());
        newsRecyclerView.setAdapter(newsAdapter);

        newsAdapter.setPagerClickListener(this);
        newsAdapter.setDataList(RealmUtils.loadFeedResponse().getData());
    }

    @Override
    public void onItemClick(int position) {
        startActivity(ReadPostActivity.getLaunchIntent(getActivity(), position));
    }
}