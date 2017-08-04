package com.example.cobeosijek.nkkutjevo.data_objects.reponses;

public class Data {
    private String name;
    private String full_picture;
    private String story;

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
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Data(String name, String full_picture, String story) {
        this.name = name;
        this.full_picture = full_picture;
        this.story = story;

    }
}
