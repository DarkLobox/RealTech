package com.example.realtech.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.realtech.CatalogActivity;
import com.example.realtech.R;
import com.example.realtech.RecoverFragment;
import com.example.realtech.SingUpActivity;
import com.example.realtech.SingUpFragment;
import com.example.realtech.ui.car.CarViewModel;
import com.example.realtech.ui.catalog.CatalogFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    View v;
    TextView recover;
    Button login;
    Fragment rec;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_home, container, false);
        recover=v.findViewById(R.id.recover_label);
        rec=new RecoverFragment();
        recover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f=getFragmentManager().beginTransaction();
                RecoverFragment rec=new RecoverFragment();
                f.replace(R.id.nav_host_fragment, rec, "fragment_recover").addToBackStack(null).commit();
            }
        });
        v.findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText u=getActivity().findViewById(R.id.name_input);
                TextView usr=getActivity().findViewById(R.id.usr);
                String n=u.getText().toString();
                usr.setText(n);



                TextView e=getActivity().findViewById(R.id.email);
                String ni=u.getText().toString();
                e.setText(ni+"@gmail.com");

                FragmentTransaction f=getFragmentManager().beginTransaction();
                CatalogFragment cat=new CatalogFragment();
                f.replace(R.id.nav_host_fragment, cat, "fragment_recover").addToBackStack(null).commit();
            }
        });

        v.findViewById(R.id.sing_up_label).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction f=getFragmentManager().beginTransaction();
                SingUpFragment cat=new SingUpFragment();
                f.replace(R.id.nav_host_fragment, cat, "fragment_recover").addToBackStack(null).commit();
            }
        });


        return v;
    }
}