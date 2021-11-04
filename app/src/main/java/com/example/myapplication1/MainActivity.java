package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, share;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button1=findViewById(R.id.btn1);
        share=findViewById(R.id.share);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {


    }

}