package com.landingcasts.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MoveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Activity Kosong");
        }
    }
}
