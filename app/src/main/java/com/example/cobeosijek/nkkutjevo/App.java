package com.example.cobeosijek.nkkutjevo;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class App extends Application {

    private static App sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        Realm.init(this);
        RealmConfiguration defaultConfig = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(defaultConfig);
    }

    public static Realm getRealm() {
        return Realm.getDefaultInstance();
    }

    public static App get() {
        return sInstance;
    }
}
