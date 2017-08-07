package com.example.cobeosijek.nkkutjevo.ui.home.adapters;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomePagerAdapter extends PagerAdapter {

    @BindView(R.id.home_pager_item_image)
    ImageView homePostImage;

    @BindView(R.id.home_pager_item_title)
    TextView homePostTitle;
    // TODO: 07/08/2017 prebaci u holder

    private final List<String> imageList = new ArrayList<>();

    public void setData(List<String> data, String title) {
        imageList.clear();
        imageList.addAll(data);
        notifyDataSetChanged();

        homePostTitle.setText(title);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.home_pager_item, container, false);

        ButterKnife.bind(this, view);

        ImageUtils.loadImage(homePostImage, imageList.get(position));

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
