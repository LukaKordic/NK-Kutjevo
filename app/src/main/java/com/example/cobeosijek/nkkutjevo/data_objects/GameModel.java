package com.example.cobeosijek.nkkutjevo.data_objects;

import android.support.annotation.NonNull;

public class GameModel extends BaseModel implements Comparable<GameModel> {

    private String homeTeam;
    private String awayTeam;
    private String date;
    private double lat;
    private double lon;
    private String homeLogo;
    private String awayLogo;

    public GameModel() {
    }

    public GameModel(String homeTeam, String awayTeam, String date, double lat, double lon, String homeLogo, String awayLogo) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.date = date;
        this.lat = lat;
        this.lon = lon;
        this.homeLogo = homeLogo;
        this.awayLogo = awayLogo;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public String getHomeTeam() {
        return returnValueOrEmpty(homeTeam);
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return returnValueOrEmpty(awayTeam);
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getDate() {
        return returnValueOrEmpty(date);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHomeLogo() {
        return returnValueOrEmpty(homeLogo);
    }

    public void setHomeLogo(String homeLogo) {
        this.homeLogo = homeLogo;
    }

    public String getAwayLogo() {
        return returnValueOrEmpty(awayLogo);
    }

    public void setAwayLogo(String awayLogo) {
        this.awayLogo = awayLogo;
    }

    @Override
    public int compareTo(@NonNull GameModel gameModel) {
        return getDate().compareTo(gameModel.getDate());
    }
}

