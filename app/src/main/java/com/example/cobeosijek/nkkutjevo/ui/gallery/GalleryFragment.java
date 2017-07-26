package com.example.cobeosijek.nkkutjevo.ui.gallery;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;

import io.realm.Realm;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

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



    }
}
