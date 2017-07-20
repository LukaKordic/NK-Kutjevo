package com.example.cobeosijek.nkkutjevo.ui.team.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.Constants;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;

public class PlayerDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        initUI();
    }

    private void initUI() {
        receiveIntent();
    }

    //activity i fragment -> activity nikad nema null intent ali fragment moze imati null bundle
    private void receiveIntent() {
        Intent intent = getIntent();

        Player player = (Player) intent.getSerializableExtra(Constants.KEY_PLAYER);
    }
}
