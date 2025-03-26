package com.example.teamtilt;

import android.content.Intent;
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

        Button buttonLevel1 = findViewById(R.id.buttonLevel1);

        buttonLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LevelSelection.this, Level1.class);
                startActivity(intent);
            }
        });
    }
}
