package com.example.stuaid;

import static com.example.stuaid.R.id.add_item;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Planer extends AppCompatActivity {

    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;
    @SuppressLint("WrongViewCast")
    private Button button = findViewById(add_item);

    public void openActivityHomepage() {
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planer);

        Button homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(v ->openActivityHomepage());

/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planer);

        listView = findViewById(R.id.listView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);

            }
        });
        items = new ArrayList<>();
        itemsAdapter   = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(itemsAdapter);
        setupListViewListener();
    }

    private void setupListViewListener() {
        return listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Context context = getApplicationContext();
                Toast.makeText(context, resid;"Item removed";
                items.remove(i);
                itemsAdapter.notifyDataSetChanged();
                return true;

            }

        });
    }

    private void addItem(View view) {
    }


     */
}}


