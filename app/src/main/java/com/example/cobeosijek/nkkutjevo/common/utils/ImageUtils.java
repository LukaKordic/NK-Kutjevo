package com.example.cobeosijek.nkkutjevo.common.utils;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by cobeosijek on 26/07/2017.
 */

public class ImageUtils {

    public static void loadImage(ImageView into, String url) {
        Picasso.with(into.getContext()).load(url).into(into);
    }
}
