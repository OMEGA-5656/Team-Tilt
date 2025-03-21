package com.example.teamtilt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelSelection extends android.app.Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_selection);
        final Button button = findViewById(R.id.buttonLevel1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("button pressed");
            }
        });
    }
}
