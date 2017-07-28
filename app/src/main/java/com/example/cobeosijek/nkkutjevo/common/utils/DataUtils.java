package com.example.cobeosijek.nkkutjevo.common.utils;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.TeamModel;

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

    public static List<TeamModel> getteamModelList (){
        List<TeamModel> teamModels = new ArrayList<>();

        teamModels.add(new TeamModel("Kutjevo", 22, 10, 6, 6, 50, 40));
        teamModels.add(new TeamModel("Pozega", 22, 20, 1, 1, 70, 30));

        return teamModels;
    }
}
