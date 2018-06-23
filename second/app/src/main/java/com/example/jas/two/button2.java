package com.example.jas.two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class button2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
    }

    public  void clicktwo_five(View source)
    {
        Intent intent=new Intent(button2.this,MainActivity.class);
        startActivity(intent);
    }

}
