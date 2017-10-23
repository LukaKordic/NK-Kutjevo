package com.example.cobeosijek.nkkutjevo.data_objects;

public class TeamModel {

    private String teamName;
    private int pointsWon;
    private int gamesWon;
    private int gamesLost;
    private int gamesDraw;
    private int goalsFor;
    private int goalsAgainst;

    public TeamModel(String teamName, int pointsWon, int gamesWon, int gamesLost, int gamesDraw, int goalsFor, int goalsAgainst) {
        this.teamName = teamName;
        this.pointsWon = pointsWon;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesDraw = gamesDraw;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public TeamModel() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPointsWon() {
        return pointsWon;
    }

    public void setPointsWon(int pointsWon) {
        this.pointsWon = pointsWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getGamesDraw() {
        return gamesDraw;
    }

    public void setGamesDraw(int gamesDraw) {
        this.gamesDraw = gamesDraw;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }
}
