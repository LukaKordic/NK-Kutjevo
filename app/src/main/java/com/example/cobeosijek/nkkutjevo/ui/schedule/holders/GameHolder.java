package com.example.cobeosijek.nkkutjevo.ui.schedule.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.GameModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GameHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.team1_image)
    ImageView team1Image;

    @BindView(R.id.team1_name)
    TextView team1Name;

    @BindView(R.id.team2_name)
    TextView team2Name;

    @BindView(R.id.team2_image)
    ImageView team2Image;

    @BindView(R.id.game_date)
    TextView gameDate;

    public GameHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    private GameModel gameModel;

    public void setGameModel(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public void showGame() {
        if (gameModel != null) {
            ImageUtils.loadSmallImage(team1Image, gameModel.getHomeLogo());
            team1Name.setText(gameModel.getHomeTeam());
            team2Name.setText(gameModel.getAwayTeam());
            ImageUtils.loadSmallImage(team2Image, gameModel.getAwayLogo());
            gameDate.setText(gameModel.getDate());
        }
    }
}
