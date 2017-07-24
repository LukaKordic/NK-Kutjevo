package com.example.cobeosijek.nkkutjevo.common.utils;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;

import java.util.ArrayList;
import java.util.List;

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
        List<Player> list = new ArrayList<>();

        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Stipo", "Jelusic", 27, "LWB", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));
        list.add(new Player("Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png"));

        return list;
    }


}
