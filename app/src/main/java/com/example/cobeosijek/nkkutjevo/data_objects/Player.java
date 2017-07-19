package com.example.cobeosijek.nkkutjevo.data_objects;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by cobeosijek on 19/07/2017.
 */

public class Player extends RealmObject {

    @PrimaryKey
    private String playerId;

    private String name;
    private int age;
    private String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
