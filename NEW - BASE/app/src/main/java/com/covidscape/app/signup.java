package com.covidscape.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;


public class signup extends AppCompatActivity {

    private EditText email, password;
    private Button submit, log;
    String em, pass;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);
        log = findViewById(R.id.log);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });

        log.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(signup.this, login.class));
            }
        });
    }

    private void validate() {
        em = email.getText().toString().trim();
        pass = password.getText().toString().trim();

        if (em.isEmpty()) {
            email.setError("Required");
            email.requestFocus();
        } else if (pass.isEmpty()) {
            password.setError("Required");
            password.requestFocus();
        } else if (pass.length() < 8) {
            password.setError("Length should >=8");
            password.requestFocus();
        } else {
//            createUser();
        }

    }
}