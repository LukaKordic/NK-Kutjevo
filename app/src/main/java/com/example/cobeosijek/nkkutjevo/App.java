package com.example.cobeosijek.nkkutjevo;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by cobeosijek on 19/07/2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RealmConfiguration defaultConfig = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(defaultConfig);
    }

    public static Realm getRealm() {
        return Realm.getDefaultInstance();
    }
}
