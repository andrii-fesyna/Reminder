package com.example.reminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickToCook (View view){
        Intent intent = new Intent(this, RemindMeToCook.class);
        startActivity(intent);
    }

    public void onClickToDo (View view){
        Intent intent = new Intent(this, RemindMeToDo.class);
        startActivity(intent);
    }

    public void onClickToWatch (View view){
        Intent intent = new Intent(this, RemindMeToWatch.class);
        startActivity(intent);
    }

    public void onClickToListen (View view){
        Intent intent = new Intent(this, RemindMeToListen.class);
        startActivity(intent);
    }


}
