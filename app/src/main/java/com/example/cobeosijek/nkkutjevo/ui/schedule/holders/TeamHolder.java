package com.example.cobeosijek.nkkutjevo.ui.schedule.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.TeamModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TeamHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.ranking_team_name)
    TextView teamName;

    @BindView(R.id.ranking_games_played)
    TextView gamesPlayed;

    @BindView(R.id.ranking_won)
    TextView gamesWon;

    @BindView(R.id.ranking_lost)
    TextView gamesLost;

    @BindView(R.id.ranking_draw)
    TextView gamesDraw;

    @BindView(R.id.ranking_goals_for)
    TextView goalsFor;

    @BindView(R.id.ranking_goals_against)
    TextView goalsAgainst;

    @BindView(R.id.ranking_goal_difference)
    TextView goalDifference;

    public TeamHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    private TeamModel teamModel;

    public void setTeamModel(TeamModel teamModel){
        this.teamModel = teamModel;
    }

    public void showTeamInfo(){
        if(teamModel != null){
            teamName.setText(teamModel.getTeamName());
            gamesPlayed.setText(String.valueOf(teamModel.getPointsWon()));
            gamesWon.setText(String.valueOf(teamModel.getGamesWon()));
            gamesLost.setText(String.valueOf(teamModel.getGamesLost()));
            gamesDraw.setText(String.valueOf(teamModel.getGamesDraw()));
            goalsFor.setText(String.valueOf(teamModel.getGoalsFor()));
            goalsAgainst.setText(String.valueOf(teamModel.getGoalsAgainst()));
            goalDifference.setText(String.valueOf(teamModel.getGoalsFor() - teamModel.getGoalsAgainst()));
        }
    }
}
