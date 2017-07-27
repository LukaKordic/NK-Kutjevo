package com.example.cobeosijek.nkkutjevo.common.utils;

import android.widget.ImageView;

import com.example.cobeosijek.nkkutjevo.data_objects.ImageModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ImageUtils {

    public static void loadImage(ImageView into, String url) {
        Picasso.with(into.getContext()).load(url).into(into);
    }

    public static List<ImageModel> loadImages() {
        List<ImageModel> imageModelList = new ArrayList<>();

        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));

        return imageModelList;
    }
}
