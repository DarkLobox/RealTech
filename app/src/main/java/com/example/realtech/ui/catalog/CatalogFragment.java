package com.example.realtech.ui.catalog;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.realtech.Adapter;
import com.example.realtech.CatalogActivity;
import com.example.realtech.Item;
import com.example.realtech.Myapp;
import com.example.realtech.R;

import java.util.ArrayList;

public class CatalogFragment extends Fragment {

    private CatalogViewModel galleryViewModel;
    private RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Item> objetos;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_catalog, container, false);
        recyclerView=v.findViewById(R.id.catalog_recycler);
        ArrayList<Item> objetos=((Myapp)getActivity().getApplication()).objetos;
        objetos.add(new Item(R.drawable.airpod,3000, "Airpod Apple", R.string.des+""));
        objetos.add(new Item(R.drawable.celular,4000, "Celular LG", R.string.des+""));
        objetos.add(new Item(R.drawable.laptop,5000, "Laptop Lenovo", R.string.des+""));
        objetos.add(new Item(R.drawable.tablet,6000, "Tablet Apple", R.string.des+""));
        objetos.add(new Item(R.drawable.torre_gamer,12000, "Computadora Acer", R.string.des+""));
        objetos.add(new Item(R.drawable.airpod,3000, "Airpod Apple", R.string.des+""));
        objetos.add(new Item(R.drawable.celular,4000, "Celular LG", R.string.des+""));
        objetos.add(new Item(R.drawable.laptop,5000, "Laptop Lenovo", R.string.des+""));
        objetos.add(new Item(R.drawable.tablet,6000, "Tablet Apple", R.string.des+""));
        objetos.add(new Item(R.drawable.torre_gamer,12000, "Computadora Acer", R.string.des+""));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), objetos);
        recyclerView.setAdapter(adapter);
        return v;
    }
}