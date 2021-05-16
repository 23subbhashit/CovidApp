package com.covidscape.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class login extends AppCompatActivity {

    signup o = new signup();
    private EditText email, password;
    private Button submit, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        get_input_();
    }

    public void get_input_(){
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);
        signup = findViewById(R.id.signup);
    }
}