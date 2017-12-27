package com.srinu.daynighttheme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonAutoMode;
    private Button buttonDayMode;
    private Button buttonNightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
        initViews();
        initListeners();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonAutoMode:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
                break;
            case R.id.buttonDayMode:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;
            case R.id.buttonNightMode:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
        }

        Intent intent = new Intent(MainActivity.this, ModeViewActivity.class);
        startActivity(intent);
    }
    private void initViews(){
        buttonAutoMode = (Button) findViewById(R.id.buttonAutoMode);
        buttonNightMode = (Button) findViewById(R.id.buttonNightMode);
        buttonDayMode = (Button) findViewById(R.id.buttonDayMode);
    }
    private void initListeners(){
        buttonAutoMode.setOnClickListener(this);
        buttonNightMode.setOnClickListener(this);
        buttonDayMode.setOnClickListener(this);

    }
}
