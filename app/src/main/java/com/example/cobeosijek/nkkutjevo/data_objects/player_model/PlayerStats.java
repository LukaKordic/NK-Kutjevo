package com.example.cobeosijek.nkkutjevo.data_objects.player_model;

import java.io.Serializable;

import io.realm.RealmObject;

public class PlayerStats extends RealmObject implements Serializable {

    private int appearances;
    private int minutesPlayed;
    private int goalsScored;
    private int yellowCards;
    private int redCards;

    public PlayerStats(int appearances, int minutesPlayed, int goalsScored, int yellowCards, int redCards) {
        this.appearances = appearances;
        this.minutesPlayed = minutesPlayed;
        this.goalsScored = goalsScored;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    public PlayerStats() {
    }

    public int getAppearances() {
        return appearances;
    }

    public void setAppearances(int appearances) {
        this.appearances = appearances;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }
}


