package com.example.cobeosijek.nkkutjevo.data_objects.player_model;

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
    private int number;
    private PlayerAbilities abilities;
    private PlayerStats stats;

    public PlayerModel(int playerId, String name, String surname, int age, String position, String image, int number, PlayerAbilities abilities, PlayerStats stats) {
        this.playerId = playerId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.image = image;
        this.number = number;
        this.abilities = abilities;
        this.stats = stats;
    }

    public PlayerModel() {
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PlayerAbilities getPlayerAbilities() {
        return abilities;
    }

    public void setPlayerAbilities(PlayerAbilities abilities) {
        this.abilities = abilities;
    }

    public PlayerStats getPlayerStats() {
        return stats;
    }

    public void setPlayerStats(PlayerStats stats) {
        this.stats = stats;
    }
}
