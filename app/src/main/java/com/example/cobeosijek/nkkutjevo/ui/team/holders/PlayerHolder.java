package com.example.cobeosijek.nkkutjevo.ui.team.holders;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.player_model.PlayerModel;
import com.example.cobeosijek.nkkutjevo.ui.team.listeners.ItemClickListener;

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

    @BindView(R.id.player_number)
    TextView playerNumber;

    private final ItemClickListener itemClickListener;

    private PlayerModel playerModel;

    public PlayerHolder(View itemView, final ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        ButterKnife.bind(this, itemView);
    }

    public void setPlayerModel(PlayerModel playerModel) {
        this.playerModel = playerModel;
    }

    public void showPlayerDetails() {
        if (playerModel != null) {
            playerName.setText(playerModel.getName());
            playerSurname.setText(playerModel.getSurname());
            ImageUtils.loadSmallImage(playerImage, playerModel.getImage());
            playerNumber.setText(String.valueOf(playerModel.getNumber()));
        }
    }

    @OnClick(R.id.team_rec_view_item_layout)
    public void onClick() {
        if (itemClickListener != null) {
            itemClickListener.onItemClick(playerModel);
        }
    }
}
