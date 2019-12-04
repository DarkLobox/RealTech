package com.example.realtech.ui.car;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.realtech.AdapterS;
import com.example.realtech.CatalogActivity;
import com.example.realtech.Item;
import com.example.realtech.MainActivity;
import com.example.realtech.Myapp;
import com.example.realtech.ProcessFragment;
import com.example.realtech.R;
import com.example.realtech.RecoverFragment;
import com.example.realtech.ShoppingCardActivity;

import java.util.ArrayList;

public class CarFragment extends Fragment {

    private CarViewModel galleryViewModel;
    ArrayList<Item>  objetos;
    RecyclerView recyclerView;
    AdapterS adapter;
    View v;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_car, container, false);
        recyclerView=v.findViewById(R.id.car_recycler);
        objetos=((Myapp)getActivity().getApplication()).car;
        /*objetos.add(new Item(R.drawable.airpod,3000, R.string.apple+"", R.string.des+""));
        objetos.add(new Item(R.drawable.celular,4000, R.string.lg+"", R.string.des+""));
        objetos.add(new Item(R.drawable.laptop,5000, R.string.leno+"", R.string.des+""));
        objetos.add(new Item(R.drawable.tablet,6000, R.string.tab+"", R.string.des+""));
        objetos.add(new Item(R.drawable.torre_gamer,12000, R.string.acer+"", R.string.des+""));
        objetos.add(new Item(R.drawable.airpod,3000, R.string.apple+"", R.string.des+""));
        objetos.add(new Item(R.drawable.celular,4000, R.string.lg+"", R.string.des+""));
        objetos.add(new Item(R.drawable.laptop,5000, R.string.leno+"", R.string.des+""));
        objetos.add(new Item(R.drawable.tablet,6000, R.string.tab+"", R.string.des+""));
        objetos.add(new Item(R.drawable.torre_gamer,12000, R.string.acer+"", R.string.des+""));*/
        objetos.add(new Item(R.drawable.airpod,3000, "Airpod Apple", R.string.des+""));
        objetos.add(new Item(R.drawable.celular,4000, "Celular LG", R.string.des+""));
        objetos.add(new Item(R.drawable.laptop,5000, "Laptop Lenovo", R.string.des+""));
        objetos.add(new Item(R.drawable.tablet,6000, "Tablet Apple", R.string.des+""));
        objetos.add(new Item(R.drawable.torre_gamer,12000, "Computadora Acer", R.string.des+""));
        objetos.add(new Item(R.drawable.airpod,3000, "Airpod Apple", "Esta computadora es gratis"));
        objetos.add(new Item(R.drawable.celular,4000, "Celular LG", "Esta computadora es gratis"));
        objetos.add(new Item(R.drawable.laptop,5000, "Laptop Lenovo", "Esta computadora es gratis"));
        objetos.add(new Item(R.drawable.tablet,6000, "Tablet Apple", "Esta computadora es gratis"));
        objetos.add(new Item(R.drawable.torre_gamer,12000, "Computadora Acer", "Esta computadora es gratis"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new AdapterS(getContext(), objetos);
        recyclerView.setAdapter(adapter);



        v.findViewById(R.id.clear_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });
        /*v.findViewById(R.id.detail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //detail();
            }
        });*/
        v.findViewById(R.id.process_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f=getFragmentManager().beginTransaction();
                ProcessFragment re=new ProcessFragment();
                f.replace(R.id.nav_host_fragment, re, "fragment_process").addToBackStack(null).commit();
            }
        });
        return v;
    }

    public void clear(){
        recyclerView=v.findViewById(R.id.car_recycler);
        objetos=new ArrayList<Item>();
        //objetos.add(new Item(R.drawable.steel_overseer,300, "Computadora Apple", "Esta computadora es gratis"));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new AdapterS(getContext(), objetos);
        recyclerView.setAdapter(adapter);
    }
    //@Override
    public void detailf(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Aqui van las especificaciones del producto                                          .                                                            .                                             .")
                .setPositiveButton("Agregar al Carrito", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();//esto se cambiaria para que se pueda agregar
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog t=builder.create();
        t.setTitle("Detalles");
        t.show();
    }



}