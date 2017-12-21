package com.android.javaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        printLog("Start Loop Time: ");

        (findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printLog("Starting Loop Time: ");
                for (int i = 1; i<= 100; i ++){
                    System.out.print("Test");
                }
                printLog("Ending Loop Time: ");
            }
        });
    }

    private String getFormattedTime(String format) {
        return new SimpleDateFormat(format, Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    private void printLog(String tag){
        Log.d(tag, Calendar.getInstance().getTimeInMillis()+"");
    }
}
