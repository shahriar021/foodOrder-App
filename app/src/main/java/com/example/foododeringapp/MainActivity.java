package com.example.foododeringapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foododeringapp.Adapters.MainAdapter;
import com.example.foododeringapp.Models.MainModel;
import com.example.foododeringapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel>list= new ArrayList<>();

        list.add(new MainModel(R.drawable.burger,"Burger","150","chesyy hot spicy"));
        list.add(new MainModel(R.drawable.pizza1,"Burger","120","chicken chesyy hot spicy"));
        list.add(new MainModel(R.drawable.pizzajpg,"pizza","950","chesyy hot spicy"));
        list.add(new MainModel(R.drawable.burger2,"Burger","150","chesyy hot spicy"));
        list.add(new MainModel(R.drawable.burger,"Burger","150","chesyy hot spicy"));
        list.add(new MainModel(R.drawable.pizzajpg,"Burger","150","chesyy hot spicy"));
        list.add(new MainModel(R.drawable.burger,"pizza","150","chesyy hot spicy"));

        MainAdapter adapter =  new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(linearLayoutManager);
    }
}