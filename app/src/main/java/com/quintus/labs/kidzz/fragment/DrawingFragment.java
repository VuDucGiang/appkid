package com.quintus.labs.kidzz.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.quintus.labs.kidzz.R;

public class DrawingFragment extends Fragment {


    public DrawingFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_drawing, container, false);

        return view;
    }


}
