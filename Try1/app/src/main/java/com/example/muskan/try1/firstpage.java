package com.example.muskan.try1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by muska on 24-09-2017.
 */

public class firstpage extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button showMap = (Button) findViewById(R.id.button);
        showMap.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent showMap = new Intent(getBaseContext(),MapsActivity.class);
                startActivity(showMap);
            }
        });
         Button addAct = (Button) findViewById(R.id.button2);
        addAct.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                Intent addAct = new Intent(getBaseContext(),Second.class);
                startActivity(addAct);
            }
        });


    }
}
