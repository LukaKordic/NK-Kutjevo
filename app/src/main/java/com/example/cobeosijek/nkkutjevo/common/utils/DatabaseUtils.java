package com.example.cobeosijek.nkkutjevo.common.utils;

import com.example.cobeosijek.nkkutjevo.App;
import com.example.cobeosijek.nkkutjevo.data_objects.PlayerModel;

import java.util.ArrayList;
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

        List<PlayerModel> playerModels = new ArrayList<>();

        playerModels.add(new PlayerModel(1, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(2, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(3, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(4, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(5, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(6, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(7, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(8, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(9, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(10, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(11, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(12, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(13, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(14, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(15, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));

        realm.copyToRealmOrUpdate(playerModels);
        realm.commitTransaction();
    }
}
