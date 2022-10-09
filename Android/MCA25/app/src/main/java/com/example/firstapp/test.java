package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button b=(Button) findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t = (TextView) findViewById(R.id.t1);
                String ts = String.valueOf(t.getText());
                int ti=Integer.parseInt(ts);
                int sq=ti*ti;
                ts = Integer.toString(sq);
                TextView r=(TextView) findViewById(R.id.t2);
                r.setText(ts);
            }
        });

    }
}