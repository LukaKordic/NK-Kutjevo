package com.example.cobeosijek.nkkutjevo.ui.news.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.Constants;
import com.example.cobeosijek.nkkutjevo.common.DummyDataFactory;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.ui.home.PagerClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewsHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.home_pager_item_image)
    ImageView image;

    @BindView(R.id.home_pager_item_title)
    TextView title;

    private final PagerClickListener pagerClickListener;
    private int position;

    public NewsHolder(View itemView, final PagerClickListener pagerClickListener) {
        super(itemView);
        this.pagerClickListener = pagerClickListener;
        ButterKnife.bind(this, itemView);
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setReponseTitle(String title) {
        if (!title.equals("")) {
            this.title.setText(title);
        } else {
            this.title.setText(Constants.DEFAULT_TITLE);
        }
    }

    public void setResponseImage(String image) {
        if (!image.equals("")) {
            ImageUtils.loadImage(this.image, image);
        } else {
            DummyDataFactory.loadDefaultImage(this.image);
        }
    }

    @OnClick
    public void onNewsClick() {
        if (pagerClickListener != null) {
            pagerClickListener.onItemClick(this.position);
        }
    }
}
