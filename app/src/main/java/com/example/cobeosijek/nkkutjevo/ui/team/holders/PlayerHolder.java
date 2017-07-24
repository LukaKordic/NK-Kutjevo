package com.example.cobeosijek.nkkutjevo.ui.team.holders;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;
import com.example.cobeosijek.nkkutjevo.ui.team.listeners.ItemClickListener;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlayerHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.player_name)
    TextView playerName;

    @BindView(R.id.player_surname)
    TextView playerSurname;

    @BindView(R.id.player_image)
    ImageView playerImage;

    private final ItemClickListener itemClickListener;

    private Player player;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerHolder(View itemView, final ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        ButterKnife.bind(this, itemView);
    }

    public void showPlayerDetails() {
        if (player != null) {
            playerName.setText(player.getName());
            playerSurname.setText(player.getSurname());
            Picasso.with(itemView.getContext()).load(player.getImage()).into(playerImage);
        }
    }

    @OnClick
    public void onClick() {
        if (itemClickListener != null) {
            itemClickListener.onItemClick(player);
        }
    }
}
