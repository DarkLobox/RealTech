package com.example.realtech;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class SingUpFragment extends Fragment {
    private Spinner languaje;

    public SingUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_sing_up, container, false);
        languaje=(Spinner)v.findViewById(R.id.languaje_spinner);
        String [] opciones = {"Español", "Portugues", "Ingles"};

        languaje.setAdapter(new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, opciones));
        return v;
    }

}
