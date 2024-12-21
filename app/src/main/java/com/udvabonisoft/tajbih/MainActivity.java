package com.udvabonisoft.tajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView total, jikir1, jikir2, jikir3, jcount1, jcount2, jcount3;
    ImageView reset, add, sub;
    ProgressBar progressbar;
    MediaPlayer successb, success;
    int count=0, count1=0, count2=0,count3=0;


    void check(int count)
    {
        successb= MediaPlayer.create(this, R.raw.success_bell);
        success= MediaPlayer.create(this, R.raw.success);
        if(count==33||count==66)
        {
            successb.start();
        }
        else if(count==100)
        {
            success.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total= findViewById(R.id.total);
        jikir1= findViewById(R.id.jikir1);
        jikir2= findViewById(R.id.jikir2);
        jikir3= findViewById(R.id.jikir3);
        jcount1= findViewById(R.id.jcount1);
        jcount2= findViewById(R.id.jcount2);
        jcount3= findViewById(R.id.jcount3);
        reset= findViewById(R.id.reset);
        add= findViewById(R.id.add);
        sub= findViewById(R.id.sub);
        progressbar= findViewById(R.id.progressbar);

        jikir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                total.setText(""+count);
                count1++;
                jcount1.setText(""+count1);
                progressbar.setProgress(count);
                progressbar.setMax(100);
                check(count);
            }
        });
        jikir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                total.setText(""+count);
                count2++;
                jcount2.setText(""+count2);
                progressbar.setProgress(count);
                progressbar.setMax(100);
                check(count);
            }
        });
        jikir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                total.setText(""+count);
                count3++;
                jcount3.setText(""+count3);
                progressbar.setProgress(count);
                progressbar.setMax(100);
                check(count);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                count1=0;
                count2=0;
                count3=0;
                total.setText(""+count);
                jcount1.setText(""+count1);
                jcount2.setText(""+count2);
                jcount3.setText(""+count3);
                progressbar.setProgress(count);
                progressbar.setMax(100);

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                total.setText(""+count);
                progressbar.setProgress(count);
                progressbar.setMax(100);
                check(count);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                total.setText(""+count);
                progressbar.setProgress(count);
                progressbar.setMax(100);
                check(count);
            }
        });

    }
}