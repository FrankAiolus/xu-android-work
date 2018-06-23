package com.example.jas.two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class button1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1_2);
    }

    public  void clickone_two_one(View source)
    {
        Intent intent=new Intent(button1_2.this,button1_1.class);
        startActivity(intent);
    }

    public  void clickone_two_three(View source)
    {
        Intent intent=new Intent(button1_2.this,button1_3.class);
        startActivity(intent);
    }

    public  void clickone_two_four(View source)
    {
        Intent intent=new Intent(button1_2.this,MainActivity.class);
        startActivity(intent);
    }

}
