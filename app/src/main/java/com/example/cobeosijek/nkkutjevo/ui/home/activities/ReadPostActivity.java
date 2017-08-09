package com.example.cobeosijek.nkkutjevo.ui.home.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.Constants;
import com.example.cobeosijek.nkkutjevo.data_objects.reponses.FeedResponse;

public class ReadPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_post);
    }

    public static Intent getLaunchIntent(Context from, FeedResponse feedResponse) {
        Intent intent = new Intent(from, ReadPostActivity.class);
        intent.putExtra(Constants.KEY_FEEDRESPONSE, feedResponse);
        return intent;
    }
}
