package com.example.realtech;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;

import java.util.ArrayList;

public class CatalogActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    private RecyclerView catalogo_recyclerView;
    Adapter adapter;
    ArrayList<Item> objetos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_catalog, R.id.nav_car, R.id.nav_home,
                R.id.nav_configure, R.id.nav_about)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        catalogo_recyclerView=findViewById(R.id.catalog_recycler);

        objetos=new ArrayList<Item>();
        objetos.add(new Item(R.drawable.steel_overseer,3000, "Computadora Apple", "Esta computadora"));
        objetos.add(new Item(R.drawable.steel_overseer,4000, "Computadora LG", "Esta computadora"));
        objetos.add(new Item(R.drawable.steel_overseer,5000, "Computadora Lenovo", "Esta computadora"));
        objetos.add(new Item(R.drawable.steel_overseer,6000, "Computadora Apple", "Esta computadora"));
        objetos.add(new Item(R.drawable.steel_overseer,12000, "Computadora Acer", "Esta computadora"));
        objetos.add(new Item(R.drawable.steel_overseer,300, "Computadora Asus", "Esta computadora"));
        objetos.add(new Item(R.drawable.steel_overseer,100, "Computadora Acer", "Esta computadora"));
        objetos.add(new Item(R.drawable.steel_overseer,5, "Computadora Apple", "Esta computadora"));
        objetos.add(new Item(R.drawable.steel_overseer,1, "Computadora Lenovo", "Esta computadora"));
        objetos.add(new Item(R.drawable.steel_overseer,3002, "Computadora LG", "Esta computadora"));


        catalogo_recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, objetos);
        catalogo_recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.catalog, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
