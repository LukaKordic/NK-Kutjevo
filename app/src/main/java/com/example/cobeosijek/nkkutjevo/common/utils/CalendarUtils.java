package com.example.cobeosijek.nkkutjevo.common.utils;

import android.util.Log;

import java.util.Calendar;

public class CalendarUtils {

    public static void getCurrentTime() {
        Calendar currentTime = Calendar.getInstance();
        Log.d("Luka", String.valueOf(currentTime.getTime()));
    }
}
