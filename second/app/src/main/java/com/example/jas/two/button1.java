package com.example.jas.two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class button1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button1);
    }

    public  void clickone_one(View source)
    {
        Intent intent=new Intent(button1.this,button1_1.class);
        startActivity(intent);
    }

    public  void clickone_two(View source)
    {
        Intent intent=new Intent(button1.this,button1_2.class);
        startActivity(intent);
    }

    public  void clickone_three(View source)
    {
        Intent intent=new Intent(button1.this,button1_3.class);
        startActivity(intent);
    }

    public  void clickone_four(View source)
    {
        Intent intent=new Intent(button1.this,MainActivity.class);
        startActivity(intent);
    }

}