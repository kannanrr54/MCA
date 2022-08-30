package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("a","create----------------------------------------------------------------------------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("a","start------------------------------------------------------------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("a","resume------------------------------------------------------------------------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("a","pause------------------------------------------------------------------------------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("a","Restart------------------------------------------------------------------------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("a","Stop------------------------------------------------------------------------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("a","Destroy------------------------------------------------------------------------------");
    }
}