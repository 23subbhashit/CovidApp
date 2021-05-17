package com.covidscape.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class login extends AppCompatActivity {

    //signup o = new signup();
    EditText email1, password1;
    Button submit1, signup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

//        get_input_();
        email1 = findViewById(R.id.email1);
        password1 = findViewById(R.id.password1);
        submit1 = findViewById(R.id.submit1);
        signup1 = findViewById(R.id.signup1);
    }

    public void get_input_(){
        email1 = findViewById(R.id.email1);
        password1 = findViewById(R.id.password1);
        submit1 = findViewById(R.id.submit1);
        signup1 = findViewById(R.id.signup1);
    }
}