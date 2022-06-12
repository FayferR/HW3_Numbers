package com.geektech.hw3_numbers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        NumberAdapter adapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        numbers = new ArrayList<>();
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
        numbers.add("+9999999999999999999999");
    }
}