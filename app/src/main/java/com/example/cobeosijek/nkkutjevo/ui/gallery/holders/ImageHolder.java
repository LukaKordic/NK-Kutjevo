package com.example.cobeosijek.nkkutjevo.ui.gallery.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.ImageModel;
import com.example.cobeosijek.nkkutjevo.ui.gallery.GalleryClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ImageHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.gallery_item_image)
    ImageView galleryItemImage;

    private ImageModel imageModel;
    private final GalleryClickListener galleryClickListener;

    public ImageHolder(View itemView, final GalleryClickListener galleryClickListener) {
        super(itemView);
        this.galleryClickListener = galleryClickListener;

        ButterKnife.bind(this, itemView);
    }

    public void setImageModel(ImageModel imageModel) {
        this.imageModel = imageModel;
    }

    public void showImage() {
        if (imageModel != null) {
            ImageUtils.loadSmallImage(galleryItemImage, imageModel.getUri());
        }
    }

    @OnClick(R.id.gallery_item_image)
    public void onImageClick() {
        if (galleryClickListener != null) {
            galleryClickListener.onItemClick(imageModel.getUri());
        }
    }
}
