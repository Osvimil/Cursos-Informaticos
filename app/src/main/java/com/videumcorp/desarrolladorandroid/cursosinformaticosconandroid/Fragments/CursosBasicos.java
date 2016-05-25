package com.videumcorp.desarrolladorandroid.cursosinformaticosconandroid.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.videumcorp.desarrolladorandroid.cursosinformaticosconandroid.R;

/**
 * Created by oswaldosaldivar on 24/05/16.
 */
public class CursosBasicos extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.cursos_basicos, container, false);
        return view;
    }
}
