package com.example.cobeosijek.nkkutjevo.ui.home.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.reponses.FeedResponse;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResponseHolder {

    @BindView(R.id.home_pager_item_image)
    ImageView responseImage;

    @BindView(R.id.home_pager_item_title)
    TextView responseTitle;

    private FeedResponse feedResponse;

    public ResponseHolder(View view) {
        ButterKnife.bind(this, view);
    }

    public void setFeedResponse(FeedResponse feedResponse) {
        this.feedResponse = feedResponse;
    }

    public void setResponseTitle(String fbResponseTitle) {
        this.responseTitle.setText(fbResponseTitle);
    }

    public void setResponseImage(String fbResponseImage) {
        ImageUtils.loadImage(responseImage, fbResponseImage);
    }
}
