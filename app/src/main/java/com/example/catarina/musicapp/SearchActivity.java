package com.example.catarina.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        final Button button = findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    startActivity(new Intent(SearchActivity.this, MainActivity.class));

            }
        });
    }
}
