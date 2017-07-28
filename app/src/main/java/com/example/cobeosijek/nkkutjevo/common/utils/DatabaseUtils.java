package com.example.cobeosijek.nkkutjevo.common.utils;

import com.example.cobeosijek.nkkutjevo.App;
import com.example.cobeosijek.nkkutjevo.common.helpers.DataHelper;
import com.example.cobeosijek.nkkutjevo.data_objects.PlayerModel;

import java.util.List;

import io.realm.Realm;

public class DatabaseUtils {
    public static List<PlayerModel> loadPlayers() {
        Realm realm = App.getRealm();
        return realm.copyFromRealm(realm.where((PlayerModel.class)).findAll());
    }

    public static void savePlayersIntoRealm() {
        Realm realm = App.getRealm();
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(DataHelper.getPlayerModelList());
        realm.commitTransaction();
    }
}
