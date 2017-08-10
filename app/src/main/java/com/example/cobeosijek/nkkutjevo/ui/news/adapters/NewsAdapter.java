package com.example.cobeosijek.nkkutjevo.ui.news.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.ui.news.holders.NewsHolder;

public class NewsAdapter extends RecyclerView.Adapter<NewsHolder> {


    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_pager_item, parent, false);
        return new NewsHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
