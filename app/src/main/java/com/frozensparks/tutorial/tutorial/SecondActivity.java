package com.frozensparks.tutorial.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
 Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);



            }


    @Override
    public void onClick(View v) {
        int id = v.getId();


        if (id == R.id.btn3) {
            Intent start = new Intent(SecondActivity.this, MainActivity.class);
            SecondActivity.this.startActivity(start);

            finish();
        }
    }
    }


