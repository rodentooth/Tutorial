#TUTORIAL
1.0: 


- Ändere die Farbe von @+id/button zu giftgrün (bleibend, also in der xml)
- Tausche den platz von @+id/button  mit dem @+id/pgb. (im TEXT (nicht design))




 
- wenn @+id/pgb 100%, ändern text von @+id/tw. 














































#Lösung:

- farbe einfach html code ändern

- mainactivity:

public class MainActivity extends AppCompatActivity {

    Button btn;
    ProgressBar pgb;
    TextView txt;
    int progressbarstatus = 0;

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

                progressbarstatus = progressbarstatus+10;

                if (progressbarstatus >= 100){


                    txt.setText("DONE!");

                }


            }
        });


    }


}


