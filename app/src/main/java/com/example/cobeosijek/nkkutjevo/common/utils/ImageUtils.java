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
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/13344784_1208951652457483_8379010329349936114_n.jpg?oh=d1452f37590cddfd256b2999b100752b&oe=5A09BAD9"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/13239238_900898740037910_3363668119296797189_n.jpg?oh=20242a8bd3380393d76ca957a379834f&oe=5A38BD02"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/13092015_1191273044230694_1888391076572090382_n.jpg?oh=75fdbeed9760b5bf71690a55e14acfe5&oe=59EA92FB"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12814411_854695664658218_5783152607682361481_n.jpg?oh=ea586c1af3eff635c9447bed596303f1&oe=5A0111B6"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/10418392_854695394658245_4298681668277809804_n.jpg?oh=fd45d42b8e6f10508b1900956aa9e0f5&oe=5A02ED66"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.ffbcdn.net/v/t1.0-9/12814207_854695214658263_8384728866098034082_n.jpg?oh=57b997e351f45cd1996f4d96b2dbfc06&oe=59F21C36"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/1914296_854695077991610_2938904400271113393_n.jpg?oh=a53f17cb46fd0e1866bdc1dfe889ae9a&oe=59F1039E"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12795319_854695007991617_1340873407996553200_n.jpg?oh=4cc5b973add45e5462f071b996825d8b&oe=5A00EA88"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12718058_854694931324958_8316921146762729112_n.jpg?oh=b8c643c4a86c5b32feb0c6b9be3c3447&oe=59F48598"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12804754_854694911324960_3507056822377608167_n.jpg?oh=367697c4b347a89cf92c23fcab27496a&oe=5A392B94"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12814189_854694881324963_7249503698973388111_n.jpg?oh=177fe46dcd913926b4622c200d8d1ef3&oe=5A33F6B7"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12806098_900362630082664_1389783148165164791_n.jpg?oh=8a0db52ee3e198d214415ca987a916ef&oe=5A098792"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12799260_978953242183525_5929870416086384240_n.jpg?oh=697f2fe374a306041208d91ef435bbaa&oe=5A028806"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12814115_978953222183527_4744980310691285523_n.jpg?oh=c5aa75db27e972e1b80b3bcb74a8d91d&oe=5A36DB7D"));

        return imageModelList;
    }
}
