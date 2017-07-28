package com.example.cobeosijek.nkkutjevo.ui.team.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.Constants;
import com.example.cobeosijek.nkkutjevo.data_objects.PlayerModel;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayerDetailsActivity extends AppCompatActivity {

    PlayerModel playerModel;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.player_details_image)
    ImageView image;

    @BindView(R.id.player_details_name)
    TextView name;

    @BindView(R.id.player_details_surname)
    TextView surname;

    @BindView(R.id.player_details_age)
    TextView age;

    @BindView(R.id.player_details_position)
    TextView position;

    @BindView(R.id.player_details_appearance)
    TextView appearance;

    @BindView(R.id.player_details_minutes_played)
    TextView minutesPlayed;

    @BindView(R.id.player_details_goals_scored)
    TextView goalsScored;

    @BindView(R.id.player_details_yellow_cards)
    TextView yellowCards;

    @BindView(R.id.player_details_red_cards)
    TextView redCards;

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
        loadPlayerDetails();
    }

    //activity i fragment -> activity nikad nema null intent ali fragment moze imati null bundle
    private void receiveIntent() {
        Intent intent = getIntent();

        playerModel = (PlayerModel) intent.getSerializableExtra(Constants.KEY_PLAYER);
    }

    private void initToolbar() {
        if (getSupportActionBar() != null) {
            setSupportActionBar(toolbar);
        }
    }

    private void loadPlayerDetails() {
        Picasso.with(this).load(playerModel.getImage()).into(image);
        name.setText(playerModel.getName());
        surname.setText(playerModel.getSurname());
        age.setText(String.valueOf(playerModel.getAge()));
        position.setText(playerModel.getPosition());
        appearance.setText(String.valueOf(playerModel.getAppearances()));
        minutesPlayed.setText(String.valueOf(playerModel.getMinutesPlayed()));
        goalsScored.setText(String.valueOf(playerModel.getGoalsScored()));
        yellowCards.setText(String.valueOf(playerModel.getYellowCards()));
        redCards.setText(String.valueOf(playerModel.getRedCards()));
    }
}
//TODO: Make a chart for displaying playerModel attributes