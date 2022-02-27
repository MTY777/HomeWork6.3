package com.example.homework63;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.homework63.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity implements OnClickListener {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
       binding.tvresult.setText(getIntent().getStringExtra("key"));
    }

    @Override
    public void onClick(Model model) {

    }
}