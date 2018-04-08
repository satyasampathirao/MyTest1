package com.satman.satya.mytest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.satman.satya.mylibrary.CircleView;

public class MainActivity extends AppCompatActivity {

    CircleView circleView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleView = findViewById(R.id.circle);

    }
}
