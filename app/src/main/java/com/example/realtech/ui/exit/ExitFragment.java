package com.example.realtech.ui.exit;

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

import com.example.realtech.CatalogActivity;
import com.example.realtech.MainActivity;
import com.example.realtech.R;
import com.example.realtech.ui.catalog.CatalogFragment;
import com.example.realtech.ui.home.HomeFragment;

public class ExitFragment extends Fragment {

    private ExitViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_exit, container, false);

        FragmentTransaction f=getFragmentManager().beginTransaction();
        HomeFragment cat=new HomeFragment();
        f.replace(R.id.nav_host_fragment, cat, "fragment_recover").addToBackStack(null).commit();
        ((TextView)getActivity().findViewById(R.id.usr)).setText("Usuario");
        ((TextView)getActivity().findViewById(R.id.email)).setText(" ");
        return root;
    }
}