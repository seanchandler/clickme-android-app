package com.example.sean.clickme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {

        AlertDialog alertDialog = new AlertDialog.Builder(this).create(); //Read Update
        alertDialog.setTitle("Alert");
        alertDialog.setMessage("Button Clicked!");

        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // here you can add functions
            }
        });

        alertDialog.show();

    }
}
