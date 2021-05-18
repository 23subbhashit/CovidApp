package com.covidscape.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
//import androidx.navigation.ui.setupWithNavController;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav);
        NavController navController = Navigation.findNavController(this, R.id.fragview);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);


    }
}