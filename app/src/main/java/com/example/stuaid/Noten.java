package com.example.stuaid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.List;

public class Noten extends AppCompatActivity {

    String []data = {"Hello","Hii", "Welcome"};
    int counter = 0;

        public void openActivityHomepage() {
            Intent intent = new Intent(this,Homepage.class);
            startActivity(intent);
        }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_noten);

            List<String> items = new LinkedList<>();
            items.add("Code it");

            RecyclerView recyclerView = findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            NotenAdapter adapter = new NotenAdapter(items);
            recyclerView.setAdapter(adapter);

            findViewById(R.id.add).setOnClickListener(view -> {
                items.add(data[counter % 3]);
                counter++;
                adapter.notifyItemInserted(items.size() - 1);
            });

            Button homeButton = findViewById(R.id.home_button);
            homeButton.setOnClickListener(v -> openActivityHomepage());
        }
}

