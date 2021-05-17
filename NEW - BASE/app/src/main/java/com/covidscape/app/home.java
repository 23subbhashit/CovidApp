package com.covidscape.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;
//import androidx.navigation.ui.setupWithNavController;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity {

    private BottomNavigationView nav;
    private FragmentContainerView nav_cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        nav = (BottomNavigationView) findViewById(R.id.nav);
        nav_cont = findViewById(R.id.fragview);

        //nav.setupWithNavController(nav_cont);


    }
}