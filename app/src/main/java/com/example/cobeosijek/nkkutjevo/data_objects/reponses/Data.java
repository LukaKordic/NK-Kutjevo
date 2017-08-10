package com.example.cobeosijek.nkkutjevo.data_objects.reponses;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import io.realm.RealmObject;

public class Data extends RealmObject implements Serializable {

    private String id;
    private String name;
    @SerializedName("full_picture")
    private String fullPicture;
    private String message;

    public Data(String id, String name, String fullPicture, String message) {
        this.id = id;
        this.name = name;
        this.fullPicture = fullPicture;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return (message == null) ? "" : message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return (name == null) ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullPicture() {
        return (fullPicture == null) ? "" : fullPicture;
    }

    public void setFullPicture(String fullPicture) {
        this.fullPicture = fullPicture;
    }
}
