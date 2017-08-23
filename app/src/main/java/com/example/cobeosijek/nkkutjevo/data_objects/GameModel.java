package com.example.cobeosijek.nkkutjevo.data_objects;

public class GameModel extends BaseModel {

    private String homeTeam;
    private String awayTeam;
    private String date;
    private String location;
    private String homeLogo;
    private String awayLogo;

    public GameModel() {
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

    public String getLocation() {
        return returnValueOrEmpty(location);
    }

    public void setLocation(String location) {
        this.location = location;
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
}

