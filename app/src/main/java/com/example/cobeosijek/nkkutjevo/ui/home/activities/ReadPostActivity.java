package com.example.cobeosijek.nkkutjevo.ui.home.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.reponses.FeedResponse;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.cobeosijek.nkkutjevo.common.Constants.KEY_FEEDRESPONSE;
import static com.example.cobeosijek.nkkutjevo.common.Constants.KEY_POSITION;

public class ReadPostActivity extends AppCompatActivity {

    @BindView(R.id.read_post_image)
    ImageView postImage;

    @BindView(R.id.read_post_title)
    TextView postTitle;

    @BindView(R.id.read_post_message)
    TextView postMessage;

    private FeedResponse fbResponse;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_post);
        initUI();
    }

    private void initUI() {
        ButterKnife.bind(this);
        receiveIntent();
        setupViews();
    }

    public static Intent getLaunchIntent(Context from, FeedResponse feedResponse, int position) {
        Intent intent = new Intent(from, ReadPostActivity.class);
        intent.putExtra(KEY_FEEDRESPONSE, feedResponse);
        intent.putExtra(KEY_POSITION, position);
        return intent;
    }

    private void receiveIntent() {
        Intent intent = getIntent();
        if (intent != null && intent.getSerializableExtra(KEY_FEEDRESPONSE) instanceof FeedResponse) {
            fbResponse = (FeedResponse) intent.getSerializableExtra(KEY_FEEDRESPONSE);
            position = intent.getIntExtra(KEY_POSITION, -1);
        }
    }

    private void setupViews() {
        ImageUtils.loadImage(postImage, fbResponse.getData().get(position).getFullPicture());
        postTitle.setText(fbResponse.getData().get(position).getName());
        postMessage.setText(fbResponse.getData().get(position).getMessage());
    }
}
