package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = String.valueOf(((TextView)findViewById(R.id.u)).getText());
                String pass = String.valueOf(((TextView)findViewById(R.id.p)).getText());
                if(user.equals("a") && pass.equals("a")){
                    Toast.makeText(getApplicationContext(), "Correct",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Wrong",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}