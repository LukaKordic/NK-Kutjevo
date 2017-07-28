package com.example.cobeosijek.nkkutjevo.ui.team.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.PlayerModel;
import com.example.cobeosijek.nkkutjevo.ui.team.holders.PlayerHolder;
import com.example.cobeosijek.nkkutjevo.ui.team.listeners.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class TeamRecyclerViewAdapter extends RecyclerView.Adapter<PlayerHolder> {

    private ItemClickListener itemClickListener;
    private final List<PlayerModel> playerModelList = new ArrayList<>();

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setPlayerModelList(List<PlayerModel> list) {
        playerModelList.clear();
        playerModelList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public PlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_recycler_view_item, parent, false);
        return new PlayerHolder(itemView, itemClickListener);
    }

    @Override
    public void onBindViewHolder(PlayerHolder holder, int position) {
        PlayerModel playerModel = getItem(position);

        holder.setPlayerModel(playerModel);
        holder.showPlayerDetails();
    }

    @Override
    public int getItemCount() {
        return playerModelList.size();
    }

    private PlayerModel getItem(int position) {
        if (position < getItemCount()) {
            PlayerModel playerModel = playerModelList.get(position);
            return playerModel != null ? playerModel : new PlayerModel();
        }
        return new PlayerModel();
    }
}
