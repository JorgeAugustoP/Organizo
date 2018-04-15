package com.example.uninorte.organizo;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class DetailsActivity extends AppCompatActivity {



    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        actionBar = getSupportActionBar();
        actionBar.setTitle("");
        actionBar.setElevation(0);

    }
}
