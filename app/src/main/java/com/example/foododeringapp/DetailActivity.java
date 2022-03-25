package com.example.foododeringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.foododeringapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_detail);
    }
}