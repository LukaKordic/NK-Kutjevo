package com.example.cobeosijek.nkkutjevo.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cobeosijek.nkkutjevo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeamFragment extends Fragment {


    public TeamFragment() {
        
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_team, container, false);
    }

}
