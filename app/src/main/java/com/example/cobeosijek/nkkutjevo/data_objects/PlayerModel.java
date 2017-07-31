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
    private int number;

    public PlayerModel(int playerId, String name, String surname, int age, String position, String image, int appearances, int minutesPlayed, int goalsScored, int yellowCards, int redCards, int number) {
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
        this.number = number;

    }

    public PlayerModel() {
    }

    public int getNumber() {
        return number;
    }

    public int getAppearances() {
        return appearances;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public int getRedCards() {
        return redCards;
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

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getImage() {
        return image;
    }
}
