package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String t="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        t=t+((Button) view).getText();
        ((TextView)findViewById(R.id.dis)).setText(t);
    }
    public void clear(View view){
        ((TextView)findViewById(R.id.dis)).setText("");
        t="";
    }
    public void result(View view){
        String r=((TextView)findViewById(R.id.dis)).getText().toString();
        int count=r.length();
        String a[]=new String[100];
        a=r.split("");
        int s=0;
        for(String i : r.split("")){
            s++;
            if(i!="+" && i!="-" &&i!="*" &&i!="/" &&i!="="){

            }
        }
        ((TextView)findViewById(R.id.dis)).setText(r.split("")[1]);
    }
}