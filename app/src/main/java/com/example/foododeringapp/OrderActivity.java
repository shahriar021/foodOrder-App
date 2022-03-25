package com.example.foododeringapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foododeringapp.Adapters.OrderAdapter;
import com.example.foododeringapp.Models.OrderModel;
import com.example.foododeringapp.databinding.ActivityMainBinding;
import com.example.foododeringapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrderModel> list = new ArrayList<>();
        list.add(new OrderModel(R.drawable.burger,"cheese burger","8","123456"));
        list.add(new OrderModel(R.drawable.burger,"cheese burger","8","123456"));
        list.add(new OrderModel(R.drawable.burger,"cheese burger","8","123456"));
        list.add(new OrderModel(R.drawable.burger,"cheese burger","8","123456"));
        list.add(new OrderModel(R.drawable.burger,"cheese burger","8","123456"));
        list.add(new OrderModel(R.drawable.burger,"cheese burger","8","123456"));
        list.add(new OrderModel(R.drawable.burger,"cheese burger","8","123456"));
        list.add(new OrderModel(R.drawable.burger,"cheese burger","8","123456"));
        list.add(new OrderModel(R.drawable.burger,"cheese burger","8","123456"));

        OrderAdapter adapter = new OrderAdapter(list,this);
        binding.OrderRecyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.OrderRecyclerView.setLayoutManager(linearLayoutManager);
    }
}