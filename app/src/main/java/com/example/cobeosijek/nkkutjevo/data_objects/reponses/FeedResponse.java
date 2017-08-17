package com.example.cobeosijek.nkkutjevo.data_objects.reponses;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class FeedResponse extends RealmObject {

    @PrimaryKey
    private int feedId;

    private RealmList<Data> data;

    public FeedResponse(RealmList<Data> data) {
        this.data = data;
    }

    public FeedResponse() {
    }

    public RealmList<Data> getData() {
        return data;
    }

    public void setData(RealmList<Data> dataRealmList) {
        this.data = dataRealmList;
    }
}