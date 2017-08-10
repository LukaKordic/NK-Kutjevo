package com.example.cobeosijek.nkkutjevo.common.utils;

import com.example.cobeosijek.nkkutjevo.App;
import com.example.cobeosijek.nkkutjevo.common.DummyDataFactory;
import com.example.cobeosijek.nkkutjevo.data_objects.PlayerModel;
import com.example.cobeosijek.nkkutjevo.data_objects.reponses.FeedResponse;

import java.util.List;

import io.realm.Realm;

public class DatabaseUtils {
    public static void savePlayersIntoRealm() {
        Realm realm = App.getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(DummyDataFactory.getPlayerModelList());
        realm.commitTransaction();
    }

    public static void saveResponseIntoRealm(FeedResponse feedResponse) {
        Realm realm = App.getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(feedResponse);
        realm.commitTransaction();
    }

    public static List<PlayerModel> loadPlayers() {
        Realm realm = App.getRealm();
        return realm.copyFromRealm(realm.where((PlayerModel.class)).findAll());
    }

    public static FeedResponse loadFeedResponse() {
        Realm realm = App.getRealm();
        return realm.copyFromRealm(realm.where((FeedResponse.class)).findFirst());
    }
}
