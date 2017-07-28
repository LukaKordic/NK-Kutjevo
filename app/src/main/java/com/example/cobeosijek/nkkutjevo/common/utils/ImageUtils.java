package com.example.cobeosijek.nkkutjevo.common.utils;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageUtils {

    public static void loadSmallImage(ImageView into, String url) {
        Glide.with(into.getContext())
                .load(url)
                .override(225, 150)
                .into(into);
    }

    public static void loadImage(ImageView into, String url) {
        Glide.with(into.getContext())
                .load(url)
                .into(into);
    }
}
