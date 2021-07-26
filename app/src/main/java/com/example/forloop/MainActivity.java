package com.example.forloop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tealButton;
    Button purpleButton;
    Button redButton;
    Button blueButton;
    ConstraintLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tealButton = findViewById(R.id.button_teal);
        purpleButton = findViewById(R.id.button_purple);
        redButton = findViewById(R.id.button_red);
        blueButton = findViewById(R.id.button_blue);
        background = findViewById(R.id.background);
        Button button;


        tealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(getResources().getColor(R.color.teal_200));
            }
        });



    }

    private void assignButtonsWithSwitchCase(){


    }
}