package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String t="",op="";
    int a=0,b=0;
    TextView d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d= (TextView) findViewById(R.id.dis);
    }
    public void click(View view){
        t=t+((Button) view).getText();
        d.setText(t);
        a=Integer.parseInt(((Button) view).getText().toString());
    }
    public void ops(View view){
        d.setText("");
        t="";
        op=((Button) view).getText().toString();
        b=a;
    }
    public void clear(View view){
        d.setText("");
        t="";
    }
    public void result(View view){
    switch (op){
        case "+" :
            d.setText(b+a);
        case "-" :
            d.setText(b-a);
        case "*" :
            d.setText(b*a);
        case "/" :
           d.setText(b/a);
    }
    }
}