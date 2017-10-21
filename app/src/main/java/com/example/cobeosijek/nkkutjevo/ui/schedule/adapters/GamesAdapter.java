package com.example.cobeosijek.nkkutjevo.ui.schedule.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.GameModel;
import com.example.cobeosijek.nkkutjevo.ui.schedule.holders.GameHolder;

import java.util.ArrayList;
import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GameHolder> {

    private final List<GameModel> gameModelList = new ArrayList<>();

    public void setGameList(List<GameModel> list) {
        gameModelList.clear();
        gameModelList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public GameHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.versus_layout, parent, false);
        return new GameHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GameHolder holder, int position) {
        GameModel gameModel = getItem(position);
        holder.setGameModel(gameModel);
        holder.showGame();
    }

    @Override
    public int getItemCount() {
        return gameModelList.size();
    }

    private GameModel getItem(int position) {
        if (position < getItemCount()) {
            GameModel gameModel = gameModelList.get(position);
            return gameModel != null ? gameModel : new GameModel();
        }
        return new GameModel();
    }
}
