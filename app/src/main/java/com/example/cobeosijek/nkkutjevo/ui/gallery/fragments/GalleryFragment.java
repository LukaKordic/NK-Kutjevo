package com.example.cobeosijek.nkkutjevo.ui.gallery.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;
import com.example.cobeosijek.nkkutjevo.common.DummyDataFactory;
import com.example.cobeosijek.nkkutjevo.ui.gallery.GalleryClickListener;
import com.example.cobeosijek.nkkutjevo.ui.gallery.activities.ImageDetailsActivity;
import com.example.cobeosijek.nkkutjevo.ui.gallery.adapters.GalleryRecyclerViewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GalleryFragment extends Fragment implements GalleryClickListener {

    @BindView(R.id.gallery_recycler_view)
    RecyclerView galleryRecyclerView;

    private final GalleryRecyclerViewAdapter galleryRecyclerViewAdapter = new GalleryRecyclerViewAdapter();

    public static GalleryFragment newInstance() {
        return new GalleryFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 2);

        galleryRecyclerView.setLayoutManager(gridLayoutManager);
        galleryRecyclerView.setItemAnimator(new DefaultItemAnimator());
        galleryRecyclerViewAdapter.setGalleryClickListener(this);
        galleryRecyclerView.setAdapter(galleryRecyclerViewAdapter);
        galleryRecyclerViewAdapter.setImageModelList(DummyDataFactory.loadImages());
    }

    @Override
    public void onItemClick(String uri) {
        startActivity(ImageDetailsActivity.getLaunchIntent(getActivity(), uri));
    }
}
