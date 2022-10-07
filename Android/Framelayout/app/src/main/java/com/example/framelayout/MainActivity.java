package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void change(View v){
        if(v.getId()==R.id.pika){
            v.setVisibility(View.GONE);
            findViewById(R.id.ball).setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.ball){
            v.setVisibility(View.GONE);
            findViewById(R.id.pika).setVisibility(View.VISIBLE);

        }
}
}