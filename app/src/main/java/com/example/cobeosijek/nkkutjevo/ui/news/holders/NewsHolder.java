package com.example.cobeosijek.nkkutjevo.ui.news.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewsHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.home_pager_item_image)
    ImageView newsImage;

    @BindView(R.id.home_pager_item_title)
    TextView newsTitle;

    public NewsHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }
}
