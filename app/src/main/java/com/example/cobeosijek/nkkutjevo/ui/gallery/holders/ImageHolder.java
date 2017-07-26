package com.example.cobeosijek.nkkutjevo.ui.gallery.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.ImageModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class ImageHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.gallery_image_details)
    ImageView galleryImageDetails;

    private ImageModel imageModel;

    public ImageHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    public void setImageModel(ImageModel imageModel) {
        this.imageModel = imageModel;
    }

    public void showImage() {
        if (imageModel != null) {
            ImageUtils.loadImage(galleryImageDetails, imageModel.getUri());
        }
    }

    @OnClick
    public void onImageClick() {

    }
}
