package com.frozensparks.tutorial.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ProgressBar pgb;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);


        pgb = (ProgressBar) findViewById(R.id.pgb);
        txt = (TextView) findViewById(R.id.tw);


        pgb.setProgress(0);
        pgb.setMax(100);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






            }
        });


    }


}
