package com.example.cobeosijek.nkkutjevo.common.utils;

import android.util.Log;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.Constants;
import com.example.cobeosijek.nkkutjevo.data_objects.GameModel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

    public static GameModel findNextGame(List<GameModel> notPlayedList) throws ParseException {
       final DateFormat format = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());
        Collections.sort(notPlayedList, new Comparator<GameModel>() {
            @Override
            public int compare(GameModel gameModel, GameModel gameModel1) {
                try {
                    return (format.parse(gameModel.getDate()).compareTo(format.parse(gameModel1.getDate())));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
        GameModel nextGame = new GameModel();
        Date date = new Date();
        for (GameModel game : notPlayedList) {
            if (format.parse(game.getDate()).after(date)) {
                nextGame = game;
                break;
            }
        }
        return nextGame;
    }
}
