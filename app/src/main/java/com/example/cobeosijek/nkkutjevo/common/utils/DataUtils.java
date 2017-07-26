package com.example.cobeosijek.nkkutjevo.common.utils;

import android.content.Context;
import com.example.cobeosijek.nkkutjevo.App;
import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;

import java.util.List;

import io.realm.Realm;

import static com.example.cobeosijek.nkkutjevo.App.getRealm;

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

    public static List<Player> loadPlayers(Context context) {
        Realm realm = App.getRealm();
        List<Player> players = realm.where(Player.class).findAll();
        System.out.println(players.size());

        return players;
    }

    public static void savePlayerIntoRealm(Context context, Player player) {
        Realm realm = App.getRealm();
        realm.beginTransaction();
        player = realm.createObject(Player.class);
        player.setImage(player.getImage());
        player.setName(player.getName());
        player.setSurname(player.getSurname());
        player.setAge(player.getAge());
        player.setPosition(player.getPosition());
        player.setAppearances(player.getAppearances());
        player.setMinutesPlayed(player.getMinutesPlayed());
        player.setGoalsScored(player.getGoalsScored());
        player.setYellowCards(player.getYellowCards());
        player.setRedCards(player.getRedCards());
        realm.commitTransaction();
    }
}
