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
    int pgbstatus = 0;

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


                pgb.setProgress(pgb.getProgress()+10);

        pgbstatus=pgbstatus+10;

                if (pgbstatus>=10){
                    txt.setText("Hoi Emi");                 }
                if (pgbstatus>=20){
                    txt.setText("Dis");                     }
                if (pgbstatus>=30){
                    txt.setText("Mami");                    }
                if (pgbstatus>=40){
                    txt.setText("gaht");                    }
                if (pgbstatus>=50){
                    txt.setText("in");                      }
                if (pgbstatus>=60){
                    txt.setText("Aldi");                    }
                if (pgbstatus>=70){
                    txt.setText("go");                      }
                if (pgbstatus>=80){
                    txt.setText("spaziere.");               }
                if (pgbstatus>=90){
                    txt.setText("^^");                      }
                if (pgbstatus>=100){
                    txt.setText("#Amana");                  }
            }
        });


    }


}
