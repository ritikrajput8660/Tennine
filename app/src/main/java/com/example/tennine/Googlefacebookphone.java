package com.example.tennine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class Googlefacebookphone extends AppCompatActivity {

    Button btnPone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googlefacebookphone);
        Objects.requireNonNull(getSupportActionBar()).hide();
        btnPone = findViewById(R.id.btnPhone);
        btnPone.setOnClickListener(view -> {
            Intent intent = new Intent(Googlefacebookphone.this,Otpphone.class);
            startActivity(intent);
        });
    }
}