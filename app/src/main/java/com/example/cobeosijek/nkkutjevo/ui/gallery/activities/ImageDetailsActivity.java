package com.example.cobeosijek.nkkutjevo.ui.gallery.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.Constants;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import uk.co.senab.photoview.PhotoViewAttacher;

public class ImageDetailsActivity extends AppCompatActivity {

    @BindView(R.id.gallery_image_details)
    ImageView galleryImage;

    public static Intent getLaunchIntent(Context from, String uri) {
        Intent intent = new Intent(from, ImageDetailsActivity.class);
        intent.putExtra(Constants.KEY_IMAGE, uri);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_details);

        initUI();
    }

    private void initUI() {
        ButterKnife.bind(this);
        ImageUtils.loadImage(galleryImage, receiveImageUri());
        attachImageZoom();
    }

    private String receiveImageUri() {
        Intent intent = getIntent();
        return intent.getStringExtra(Constants.KEY_IMAGE);
    }

    private void attachImageZoom() {
        PhotoViewAttacher photoViewAttacher = new PhotoViewAttacher(galleryImage);
        photoViewAttacher.update();
    }
}
