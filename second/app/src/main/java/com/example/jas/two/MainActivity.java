package com.example.jas.two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void clickone(View source)
    {
        Intent intent=new Intent(MainActivity.this,button1.class);
        startActivity(intent);
    }

    public  void clicktwo(View source)
    {
        Intent intent=new Intent(MainActivity.this,button2.class);
        startActivity(intent);
    }

    public  void clickthree(View source)
    {
        Intent intent=new Intent(MainActivity.this,button3.class);
        startActivity(intent);
    }

    /*
    public  void clickfour(View source)
    {
        Intent intent=new Intent(MainActivity.this,button4.class);
        startActivity(intent);
    }

    public  void clickfive(View source)
    {
        Intent intent=new Intent(MainActivity.this,button5.class);
        startActivity(intent);
    }
    */
}
