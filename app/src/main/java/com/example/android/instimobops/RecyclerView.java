package com.example.android.instimobops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity {
    private List<Numbers> numbersList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        numbersList = new ArrayList<>();

        for(int i = 1; i <= 10 ; i++){
            Numbers numbers = new Numbers(i);
            numbersList.add(numbers);
        }
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView)findViewById(R.id.recycle);
        ViewAdapter adapter = new ViewAdapter(numbersList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}
