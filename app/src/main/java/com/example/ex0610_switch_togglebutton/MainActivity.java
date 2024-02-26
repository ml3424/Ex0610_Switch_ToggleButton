package com.example.ex0610_switch_togglebutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

import java.lang.reflect.Constructor;

public class MainActivity extends AppCompatActivity {

    ToggleButton tgbtn;
    Switch swi;
    Button btn;
    ConstraintLayout back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgbtn = findViewById(R.id.tgBtn);
        swi = findViewById(R.id.swi);
        btn = findViewById(R.id.btn);
        back = findViewById(R.id.back);

    }
    
}