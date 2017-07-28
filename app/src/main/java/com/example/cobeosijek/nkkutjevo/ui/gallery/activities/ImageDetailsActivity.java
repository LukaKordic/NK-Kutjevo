package com.example.cobeosijek.nkkutjevo.ui.gallery.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.Constants;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ImageDetailsActivity extends AppCompatActivity {

    @BindView(R.id.gallery_image_details)
    ImageView galleryImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_details);

        initUI();
    }

    private void initUI() {
        setStatusBarColor();
        ButterKnife.bind(this);
        receiveImageUri();
        ImageUtils.loadImage(galleryImage, receiveImageUri());
    }

    private void setStatusBarColor() {
//        getWindow().setStatusBarColor(getResources().getColor(R.color.statusBarColor));
    }

    private String receiveImageUri() {
        Intent intent = getIntent();
        return intent.getStringExtra(Constants.KEY_IMAGE);
    }
}
