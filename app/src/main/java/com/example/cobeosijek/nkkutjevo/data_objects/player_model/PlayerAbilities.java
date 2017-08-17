package com.example.cobeosijek.nkkutjevo.data_objects.player_model;

import java.io.Serializable;

import io.realm.RealmObject;

public class PlayerAbilities extends RealmObject implements Serializable {

    private int defending;
    private int physical;
    private int speed;
    private int creativity;
    private int attacking;
    private int technical;
    private int aerial;
    private int mental;

    public PlayerAbilities(int defending, int physical, int speed, int creativity, int attacking, int technical, int aerial, int mental) {
        this.defending = defending;
        this.physical = physical;
        this.speed = speed;
        this.creativity = creativity;
        this.attacking = attacking;
        this.technical = technical;
        this.aerial = aerial;
        this.mental = mental;
    }

    public PlayerAbilities() {
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
}


