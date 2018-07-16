package com.cryptenet.thanatos.activity_lifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "demo" + MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.d(TAG, "Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity Resumed");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Activity Destroyed");
    }
}
