package com.covidscape.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class reset_pass extends AppCompatActivity {

    private EditText email;
    private Button submit;
    String em;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_pass);

        mAuth = FirebaseAuth.getInstance();
        email = findViewById(R.id.email);

        em = email.getText().toString();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset(em);
            }
        });

    }

    private void reset(String emailAddress) {
        mAuth.sendPasswordResetEmail(emailAddress)
                .addOnCompleteListener(new OnCompleteListener() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(reset_pass.this, "Reset Link sent to your email!",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(reset_pass.this, login.class));
                        } else {
                            Toast.makeText(reset_pass.this, "Unable to reset, Try again!",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}