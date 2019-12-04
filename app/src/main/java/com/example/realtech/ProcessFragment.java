package com.example.realtech;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class ProcessFragment extends Fragment {
    View v;

    private Spinner card;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_process, container, false);
        card=(Spinner)v.findViewById(R.id.card_type_spinner);
        String [] opciones = {"MasterCard", "Visa", "Banbif"};

        card.setAdapter(new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, opciones));
        return v;
    }
}
