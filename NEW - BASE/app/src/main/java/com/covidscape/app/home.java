package com.covidscape.app;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
//import androidx.navigation.ui.setupWithNavController;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragview, new dash()).commit();

        BottomNavigationView bottomNav = findViewById(R.id.nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                    Fragment selectedFragment = null;
                    
                    switch (item.getItemId()){
                        case R.id.user:
                            selectedFragment = new user();
                            break;

                        case R.id.myth:
                            selectedFragment = new myth();
                            break;

                        case R.id.news:
                            selectedFragment = new news();
                            break;

                        case R.id.dash:
                            selectedFragment = new dash();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragview, selectedFragment).commit();

                    return true;
                }
            };
}