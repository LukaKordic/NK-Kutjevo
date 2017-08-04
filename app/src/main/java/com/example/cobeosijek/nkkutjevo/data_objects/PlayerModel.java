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
    private int defending;
    private int physical;
    private int speed;
    private int creativity;
    private int attacking;
    private int technical;
    private int aerial;
    private int mental;

    public PlayerModel(int playerId, String name, String surname, int age, String position, String image, int appearances, int minutesPlayed, int goalsScored, int yellowCards, int redCards, int number, int defending, int physical, int speed, int creativity, int attacking, int technical, int aerial, int mental) {
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

        this.defending = defending;
        this.physical = physical;
        this.speed = speed;
        this.creativity = creativity;
        this.attacking = attacking;
        this.technical = technical;
        this.aerial = aerial;
        this.mental = mental;
    }

    public PlayerModel() {
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getAttacking() {
        return attacking;
    }

    public void setAttacking(int attacking) {
        this.attacking = attacking;
    }

    public int getTechnical() {
        return technical;
    }

    public void setTechnical(int technical) {
        this.technical = technical;
    }

    public int getAerial() {
        return aerial;
    }

    public void setAerial(int aerial) {
        this.aerial = aerial;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
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
