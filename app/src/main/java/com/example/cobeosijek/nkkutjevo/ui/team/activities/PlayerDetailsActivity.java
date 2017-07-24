package com.example.cobeosijek.nkkutjevo.ui.team.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.Constants;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayerDetailsActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        ButterKnife.bind(this);
        initUI();
    }

    private void initUI() {
        receiveIntent();
        initToolbar();
    }

    private void initToolbar() {
        if(getSupportActionBar() != null) {
            setSupportActionBar(toolbar);
        }
    }

    //activity i fragment -> activity nikad nema null intent ali fragment moze imati null bundle
    private void receiveIntent() {
        Intent intent = getIntent();

        Player player = (Player) intent.getSerializableExtra(Constants.KEY_PLAYER);
    }
}
