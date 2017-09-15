package com.example.cobeosijek.nkkutjevo.ui.news.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.reponses.Data;
import com.example.cobeosijek.nkkutjevo.ui.home.PagerClickListener;
import com.example.cobeosijek.nkkutjevo.ui.news.holders.NewsHolder;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsHolder> {

    private final List<Data> dataList = new ArrayList<>();
    private PagerClickListener pagerClickListener;

    public void setPagerClickListener(PagerClickListener pagerClickListener) {
        this.pagerClickListener = pagerClickListener;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList.clear();
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_pager_item, parent, false);
        return new NewsHolder(itemView, pagerClickListener);
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {
        holder.setPosition(position);
        holder.setResponseTitle(dataList.get(position).getName());
        holder.setResponseImage(dataList.get(position).getFullPicture());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
