package com.example.cobeosijek.nkkutjevo;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        RealmConfiguration defaultConfig = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(defaultConfig);
    }

    public static Realm getRealm() {
        return Realm.getDefaultInstance();
    }
}
