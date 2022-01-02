package com.example.tennine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class SignUpLogin extends AppCompatActivity {
    Button Loginbtn,SingUpbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_login);
        Objects.requireNonNull(getSupportActionBar()).hide();

        Loginbtn = findViewById(R.id.btnLogin);
        SingUpbtn = findViewById(R.id.btnSignUp);
        SingUpbtn.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpLogin.this,Googlefacebookphone.class);
            startActivity(intent);
        });
    }
}