package com.example.jas.two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class button1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1_1);
    }

    public  void clickone_one_two(View source)
    {
        Intent intent=new Intent(button1_1.this,button1_2.class);
        startActivity(intent);
    }

    public  void clickone_one_three(View source)
    {
        Intent intent=new Intent(button1_1.this,button1_3.class);
        startActivity(intent);
    }

    public  void clickone_one_four(View source)
    {
        Intent intent=new Intent(button1_1.this,MainActivity.class);
        startActivity(intent);
    }

}
