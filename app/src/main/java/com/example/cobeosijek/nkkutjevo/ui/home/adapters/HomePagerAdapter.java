package com.example.cobeosijek.nkkutjevo.ui.home.adapters;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.ui.home.holders.ResponseHolder;

import java.util.ArrayList;
import java.util.List;

public class HomePagerAdapter extends PagerAdapter {

    private final List<String> imageList = new ArrayList<>();
    private final List<String> titleList = new ArrayList<>();

    public void setData(List<String> imageList, List<String> titleList) {
        this.imageList.clear();
        this.imageList.addAll(imageList);
        this.titleList.addAll(titleList);
        notifyDataSetChanged();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.home_pager_item, container, false);
        ResponseHolder responseHolder = new ResponseHolder(view);

        if (!imageList.isEmpty() && !titleList.isEmpty()) {
            responseHolder.setResponseImage(imageList.get(position));
            responseHolder.setResponseTitle(titleList.get(position));
        }

        container.addView(view);
        return view;
    }

    @Override
    public int getCount() { //
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
