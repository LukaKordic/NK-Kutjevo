package com.example.cobeosijek.nkkutjevo.data_objects.reponses;

public class Data {
    private String id;
    private String name;
    private String full_picture;
    private String message;

    public Data(String id, String name, String full_picture, String message) {
        this.id = id;
        this.name = name;
        this.full_picture = full_picture;
        this.message = message;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_picture() {
        return full_picture;
    }

    public void setFull_picture(String full_picture) {
        this.full_picture = full_picture;
    }

    public String getStory() {
        return message;
    }

    public void setStory(String story) {
        this.message = message;
    }
}
