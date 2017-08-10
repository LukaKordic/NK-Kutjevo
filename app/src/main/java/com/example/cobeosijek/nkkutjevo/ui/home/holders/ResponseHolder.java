package com.example.cobeosijek.nkkutjevo.ui.home.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.reponses.FeedResponse;
import com.example.cobeosijek.nkkutjevo.ui.home.PagerClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ResponseHolder {

    @BindView(R.id.home_pager_item_image)
    ImageView responseImage;

    @BindView(R.id.home_pager_item_title)
    TextView responseTitle;

    private final PagerClickListener pagerClickListener;
    private FeedResponse fbResponse;
    private int position;

    public ResponseHolder(View view, final PagerClickListener pagerClickListener) {
        this.pagerClickListener = pagerClickListener;
        ButterKnife.bind(this, view);
    }

    public void setFbResponse(FeedResponse fbResponse) {
        this.fbResponse = fbResponse;
    }

    public void getItemPosition(int position) {
        this.position = position;
    }

    public void setResponseTitle() {
        responseTitle.setText(fbResponse.getData().get(position).getName());
    }

    public void setResponseImage() {
        ImageUtils.loadImage(responseImage, fbResponse.getData().get(position).getFullPicture());
    }

    @OnClick(R.id.pager_item_layout)
    public void onClick() {
        if (pagerClickListener != null) {
            pagerClickListener.onItemClick(fbResponse, position);
        }
    }
}
