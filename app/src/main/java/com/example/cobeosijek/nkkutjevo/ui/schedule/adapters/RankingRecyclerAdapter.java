package com.example.cobeosijek.nkkutjevo.ui.schedule.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.TeamModel;
import com.example.cobeosijek.nkkutjevo.ui.schedule.holders.TeamHolder;

import java.util.ArrayList;
import java.util.List;

public class RankingRecyclerAdapter extends RecyclerView.Adapter<TeamHolder> {

    private final List<TeamModel> teamModelList = new ArrayList<>();

    public void setTeamModelList(List<TeamModel> teamList) {
        teamModelList.clear();
        teamModelList.addAll(teamList);
        notifyDataSetChanged();
    }

    @Override
    public TeamHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.ranking_table_item, parent, false);
        return new TeamHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TeamHolder holder, int position) {
        TeamModel teamModel = getItem(position);

        holder.setTeamModel(teamModel);
        holder.showTeamInfo();
    }

    @Override
    public int getItemCount() {
        return teamModelList.size();
    }

    private TeamModel getItem(int position) {
        if (position < getItemCount()) {
            TeamModel teamModel = teamModelList.get(position);
            return teamModel != null ? teamModel : new TeamModel();
        }
        return new TeamModel();
    }
}
