package com.example.cobeosijek.nkkutjevo.data_objects;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class PlayerModel extends RealmObject implements Serializable {

    @PrimaryKey
    private int playerId;

    private String name;
    private String surname;
    private int age;
    private String position;
    private String image;
    private int appearances;
    private int minutesPlayed;
    private int goalsScored;
    private int yellowCards;
    private int redCards;

    public PlayerModel(int playerId, String name, String surname, int age, String position, String image, int appearances, int minutesPlayed, int goalsScored, int yellowCards, int redCards) {
        this.playerId = playerId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.image = image;
        this.appearances = appearances;
        this.minutesPlayed = minutesPlayed;
        this.goalsScored = goalsScored;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    public PlayerModel() {
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
