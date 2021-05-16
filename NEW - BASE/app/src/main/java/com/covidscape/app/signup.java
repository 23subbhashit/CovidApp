package com.covidscape.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.*;

public class signup extends AppCompatActivity {

    private EditText email, password;
    private Button submit;
    String em, pass;
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        if (auth.getCurrentUser()!=null){
//            openMain();
//        }
//    }
//
//    private void openMain() {
//        startActivity(new Intent(this, MainActivity.class));
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.signup);
//
//        email = findViewById(R.id.email);
//        password = findViewById(R.id.password);
//        submit = findViewById(R.id.submit);
//
//        submit.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                validate();
//            }
//        });
//    }
//
//    private void validate() {
//        em = email.getText().toString();
//        pass = password.getText().toString();
//
//        if (em.isEmpty()){
//            email.setError("Required");
//            email.requestFocus();
//        }
//        else if (pass.isEmpty()){
//            password.setError("Required");
//            password.requestFocus();
//        }
//        else if(pass.length()<8){
//            password.setError("Length should >=8");
//            password.requestFocus();
//        }
//        else{
//            createUser();
//        }
//
//    }

//    private void createUser() {
//        auth.createUserWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//                            Log.d(TAG, "createUserWithEmail:success");
//                            FirebaseUser user = mAuth.getCurrentUser();
//                            updateUI(user);
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
//                            Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//                            updateUI(null);
//                        }
//                    }
//                });
    }