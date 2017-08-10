package com.example.cobeosijek.nkkutjevo.data_objects.reponses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.realm.RealmObject;

public class FeedResponse extends RealmObject implements Serializable {

    private List<Data> data = new ArrayList<>();

    public FeedResponse(List<Data> data) {
        this.data = data;
    }

    public FeedResponse() {
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}