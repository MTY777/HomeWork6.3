package com.example.homework63;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.conteyner_one, new MainFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.conteyner_two, new SecondFragment()).commit();

    }
}