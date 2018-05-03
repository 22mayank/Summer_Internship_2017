package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class Credit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credit);

        ImageButton i2 = (ImageButton)findViewById(R.id.pizz2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Credit.this,Delivery.class);
                startActivity(i);
            }
        });
        ImageButton n = (ImageButton)findViewById(R.id.nn);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Credit.this,Pizza_Preference.class);
                startActivity(i2);
            }
        });

    }
}
