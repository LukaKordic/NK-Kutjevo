package com.example.cobeosijek.nkkutjevo.ui.team.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.Constants;
import com.example.cobeosijek.nkkutjevo.common.utils.RadarChartUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.PlayerModel;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
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

    @BindView(R.id.radar_chart)
    RadarChart radarChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        ButterKnife.bind(this);
        initUI();
    }

    private void initUI() {
        receiveIntent();
        changeStatusBarColor();
        initToolbar();
        loadPlayerDetails();
        createRadarChart();
    }

    //activity i fragment -> activity nikad nema null intent ali fragment moze imati null bundle
    private void receiveIntent() {
        Intent intent = getIntent();

        playerModel = (PlayerModel) intent.getSerializableExtra(Constants.KEY_PLAYER);
    }

    private void changeStatusBarColor() {
        getWindow().setStatusBarColor(getResources().getColor(R.color.statusBarColor));
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

    private void createRadarChart() {
        RadarDataSet radarDataSet = new RadarDataSet(RadarChartUtils.createRadarEntries(), name.getText().toString());
        radarDataSet.setColor(Color.GREEN);
        radarDataSet.setFillColor(Color.GREEN);
        radarDataSet.setDrawFilled(true);
        RadarData radarData = new RadarData(radarDataSet);
        radarData.setLabels(RadarChartUtils.createRadarLabels());
        radarChart.getDescription().setEnabled(false);
        radarChart.setData(radarData);
        radarChart.getYAxis().setAxisMinimum(0);
        radarChart.invalidate();

    }
}
//TODO: put labels on the chart