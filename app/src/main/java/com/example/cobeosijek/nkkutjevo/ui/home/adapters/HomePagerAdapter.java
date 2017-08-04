package com.example.cobeosijek.nkkutjevo.ui.home.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomePagerAdapter extends android.support.v4.view.PagerAdapter {

    private final List<String> imageList;

    @BindView(R.id.home_pager_item_image)
    ImageView homePostImage;

    @BindView(R.id.home_pager_item_title)
    TextView homePostTitle;

    public HomePagerAdapter(List<String> imageList) {
        this.imageList = imageList;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.home_pager_item, container, false);

        ButterKnife.bind(this, view);

        ImageUtils.loadImage(homePostImage, imageList.get(position));
        homePostTitle.setText("Post title");

        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        if (object instanceof View) {
            container.removeView((View) object);
        }
    }
}
