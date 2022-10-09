package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = this;
        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, test.class);
                startActivity(intent);
               /* TextView a = (TextView) findViewById(R.id.f);
                TextView b = (TextView) findViewById(R.id.s);
                int a1 = Integer.parseInt(a.getText().toString())+Integer.parseInt(b.getText().toString());
                TextView t = (TextView) findViewById(R.id.r);
                t.setText(String.valueOf(a1));*/

            }
        });
        findViewById(R.id.b3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView a = (TextView) findViewById(R.id.f);
                TextView b = (TextView) findViewById(R.id.s);
                int a1 = Integer.parseInt(a.getText().toString())-Integer.parseInt(b.getText().toString());
                TextView t = (TextView) findViewById(R.id.r);
                t.setText(String.valueOf(a1));

            }
        });
        findViewById(R.id.b4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView a = (TextView) findViewById(R.id.f);
                TextView b = (TextView) findViewById(R.id.s);
                int a1 = Integer.parseInt(a.getText().toString())*Integer.parseInt(b.getText().toString());
                TextView t = (TextView) findViewById(R.id.r);
                t.setText(String.valueOf(a1));

            }
        });
        findViewById(R.id.b5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView a = (TextView) findViewById(R.id.f);
                TextView b = (TextView) findViewById(R.id.s);
                int a1 = Integer.parseInt(a.getText().toString())/Integer.parseInt(b.getText().toString());
                TextView t = (TextView) findViewById(R.id.r);
                t.setText(String.valueOf(a1));

            }
        });
    }

}