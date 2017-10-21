package com.example.cobeosijek.nkkutjevo.common.utils;

import com.example.cobeosijek.nkkutjevo.App;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class FirebaseUtils {

    public static DatabaseReference getDatabaseReference() {
        return App.getFirebaseDb().getReference();
    }
}
