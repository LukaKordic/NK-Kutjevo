package com.example.cobeosijek.nkkutjevo.common.utils;

import com.example.cobeosijek.nkkutjevo.App;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class DatabaseUtils {
    public static List<Player> loadPlayers() {
        Realm realm = App.getRealm();
        return realm.copyFromRealm(realm.where((Player.class)).findAll());
    }

    public static void savePlayersIntoRealm() {
        Realm realm = App.getRealm();
        realm.beginTransaction();

        List<Player> players = new ArrayList<>();

        players.add(new Player(1, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(2, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(3, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(4, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(5, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(6, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(7, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(8, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(9, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(10, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(11, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(12, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(13, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(14, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        players.add(new Player(15, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));

        realm.copyToRealmOrUpdate(players);
        realm.commitTransaction();
    }
}
