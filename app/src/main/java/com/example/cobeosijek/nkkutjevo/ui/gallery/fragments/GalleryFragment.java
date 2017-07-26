package com.example.cobeosijek.nkkutjevo.ui.gallery.fragments;


import android.content.Intent;
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
import com.example.cobeosijek.nkkutjevo.common.utils.DataUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.Player;
import com.example.cobeosijek.nkkutjevo.ui.gallery.activities.ImageDetailsActivity;
import com.example.cobeosijek.nkkutjevo.ui.gallery.adapters.GalleryRecyclerViewAdapter;
import com.example.cobeosijek.nkkutjevo.ui.team.listeners.ItemClickListener;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment implements ItemClickListener {

    private final GalleryRecyclerViewAdapter galleryRecyclerViewAdapter = new GalleryRecyclerViewAdapter();

    @BindView(R.id.gallery_recycler_view)
    RecyclerView galleryRecyclerView;

    public static GalleryFragment newInstance() {
        Bundle args = new Bundle();

        GalleryFragment fragment = new GalleryFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        galleryRecyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        galleryRecyclerView.setItemAnimator(new DefaultItemAnimator());
        galleryRecyclerView.setAdapter(galleryRecyclerViewAdapter);
        galleryRecyclerViewAdapter.setImageModelList(DataUtils.loadImages());


    }

    @Override
    public void onItemClick(Player player) {
        Intent intent = new Intent(getActivity(), ImageDetailsActivity.class);
    }
}
