package com.example.stuaid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stuaid.Adapter.ToDoAdapter;
import com.example.stuaid.Model.ToDoModel;
import com.example.stuaid.R;
import com.example.stuaid.activities.Exams;
import com.example.stuaid.activities.Grades;
import com.example.stuaid.activities.Homepage;

import java.util.ArrayList;
import java.util.List;


public class Task extends AppCompatActivity {

    private RecyclerView tasksRecyclerview;
    private ToDoAdapter tasksAdapter;
    private List<ToDoModel> taskList;


    public void openActivityHomepage() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
        }
    public void openActivityNoten(){
        Intent intent = new Intent(this, Grades.class);
        startActivity(intent);
        }
    public void openActivityPlaner() {
        Intent intent = new Intent(this, Exams.class);
        startActivity(intent);
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        getSupportActionBar().hide();

        taskList = new ArrayList<>();

        tasksRecyclerview = findViewById(R.id.tasksRecyclerView);
        tasksRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        tasksAdapter = new ToDoAdapter(this);
        tasksRecyclerview.setAdapter(tasksAdapter);

        ToDoModel task = new ToDoModel ();
        task.setTask("this is a task");
        task.setStatus(0);
        task.setId(1);

        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);

        tasksAdapter.setTasks(taskList);




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

        Button homeButtonTodo = findViewById(R.id.home_button_tasks);
        homeButtonTodo.setOnClickListener(v ->openActivityHomepage());

        Button planerButtonTodo = findViewById(R.id.exams_button_tasks);
        planerButtonTodo.setOnClickListener(v -> openActivityPlaner());

        Button notenButtonTodo = findViewById(R.id.grades_button_tasks);
        notenButtonTodo.setOnClickListener(v -> openActivityNoten());

    }
}


