package com.example.cobeosijek.nkkutjevo.ui.team.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;
import com.example.cobeosijek.nkkutjevo.ui.team.holders.PlayerHolder;
import com.example.cobeosijek.nkkutjevo.ui.team.listeners.ItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class TeamRecyclerViewAdapter extends RecyclerView.Adapter<PlayerHolder> {

    private ItemClickListener itemClickListener;
    private final List<Player> playerList = new ArrayList<>();

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public void setPlayerList(List<Player> list) {
        playerList.clear();
        playerList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public PlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_recycler_view_item, parent, false);
        return new PlayerHolder(itemView, itemClickListener);
    }

    @Override
    public void onBindViewHolder(PlayerHolder holder, int position) {
        Player player = getItem(position);

        holder.setPlayer(player);
        holder.showPlayerDetails();
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    private Player getItem(int position) {
        if (position < getItemCount()) {
            Player player = playerList.get(position);
            return player != null ? player : new Player();
        }
        return new Player();
    }
}
