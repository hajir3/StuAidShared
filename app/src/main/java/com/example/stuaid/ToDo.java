package com.example.stuaid;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;



    public class ToDo extends ListActivity {
        String[] eintrag = {
                "Eintrag 1",
                "Eintrag 2",
                "Eintrag 3",
                "Eintrag 4",
                "Eintrag 5",
                "Eintrag 6",
                "sdfaf" +
                        "afdsf",
                "sdalkd",
                "slkdfasd",
                "asdaösljd",
                "sdfjlsf",
                "lksdka",
                "ljhsdpoad",
        };

    public void onListItemClick(ListView parent, View v,
                                int position, long id) {
        Toast.makeText(this, "Ihre Auswahl : " + eintrag[position],
                Toast.LENGTH_LONG).show();
    }

    public void openActivityHomepage() {
        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
        }
    public void openActivityNoten(){
        Intent intent = new Intent(this,Noten_Semester.class);
        startActivity(intent);
        }
    public void openActivityPlaner() {
        Intent intent = new Intent(this,Planer.class);
        startActivity(intent);
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        WindowInsetsControllerCompat windowInsetsController =
                ViewCompat.getWindowInsetsController(getWindow().getDecorView());
        if (windowInsetsController == null) {
            return;
        }
        windowInsetsController.setAppearanceLightNavigationBars(true);
        windowInsetsController.setAppearanceLightStatusBars(true);

        Button homeButton2 = findViewById(R.id.home_button2);
        homeButton2.setOnClickListener(v ->openActivityHomepage());

        Button planerButton = findViewById(R.id.planer_button);
        planerButton.setOnClickListener(v -> openActivityPlaner());

        Button todoButton = findViewById(R.id.noten_button);
        todoButton.setOnClickListener(v -> openActivityNoten());


        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,eintrag));
    }





}


