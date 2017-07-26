package com.example.cobeosijek.nkkutjevo.common.utils;

import com.example.cobeosijek.nkkutjevo.App;
import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.ImageModel;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class DataUtils {

    public static int getScreenTitle(int screenId) {
        switch (screenId) {
            case R.id.nav_header_home:
                return R.string.nav_home_title;

            case R.id.nav_header_news:
                return R.string.nav_news_title;

            case R.id.nav_header_gallery:
                return R.string.nav_gallery_title;

            case R.id.nav_header_team:
                return R.string.nav_team_title;

            case R.id.nav_header_schedule:
                return R.string.nav_schedule_title;

            default:
                return 0;
        }
    }

    public static List<Player> loadPlayers() {
        Realm realm = App.getRealm();
        return realm.copyFromRealm(realm.where((Player.class)).findAll());
    }

    public static void savePlayersIntoRealm() {
        Realm realm = App.getRealm();
        realm.beginTransaction();

        List<Player> players = new ArrayList<>();

        players.add(new Player(1, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(2, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(3, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(4, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(5, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(6, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(7, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(8, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(9, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(10, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(11, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(12, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(13, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(14, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(15, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));

        realm.copyToRealmOrUpdate(players);
        realm.commitTransaction();
    }

    public static List<ImageModel> loadImages() {
        List<ImageModel> imageModelList = new ArrayList<>();

        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));

        return imageModelList;
    }
}
