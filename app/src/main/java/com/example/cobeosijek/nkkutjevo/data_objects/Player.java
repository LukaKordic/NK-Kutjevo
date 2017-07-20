package com.example.cobeosijek.nkkutjevo.data_objects;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Player extends RealmObject implements Serializable {

    @PrimaryKey
    private String playerId;

    private String name;
    private String surname;
    private int age;
    private String position;
    private String image;

    public Player(String name, String surname, int age, String position, String image) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.image = image;
    }

    public Player() {
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
