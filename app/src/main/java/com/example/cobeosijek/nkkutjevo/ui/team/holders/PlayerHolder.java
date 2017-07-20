package com.example.cobeosijek.nkkutjevo.ui.team.holders;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;
import com.example.cobeosijek.nkkutjevo.ui.team.listeners.ItemClickListener;
import com.squareup.picasso.Picasso;

public class PlayerHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final TextView playerName;
    private final TextView playerSurname;
    private final TextView playerAge;
    private final TextView playerPosition;
    private final ImageView playerImage;

    private final ItemClickListener itemClickListener;

    private Player player;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerHolder(View itemView, final ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;

        playerName = itemView.findViewById(R.id.player_name);
        playerSurname = itemView.findViewById(R.id.player_surname);
        playerAge = itemView.findViewById(R.id.player_age);
        playerPosition = itemView.findViewById(R.id.player_position);
        playerImage = itemView.findViewById(R.id.player_image);
    }

    public void showPlayerDetails() {
        if (player != null) {
            itemView.setOnClickListener(this);
            playerName.setText(player.getName());
            playerSurname.setText(player.getSurname());
            playerAge.setText(String.valueOf(player.getAge()));
            playerPosition.setText(player.getPosition());
            Picasso.with(itemView.getContext()).load(player.getImage()).into(playerImage);
        }
    }

    @Override
    public void onClick(View view) {
        if (itemClickListener != null) {
            itemClickListener.onItemClick(player);
        }
    }
}
