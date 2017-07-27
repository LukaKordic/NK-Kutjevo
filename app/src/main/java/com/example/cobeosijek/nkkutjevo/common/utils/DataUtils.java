package com.example.cobeosijek.nkkutjevo.common.utils;

import com.example.cobeosijek.nkkutjevo.R;

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
}
