package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Payment_details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_details);

        ImageButton im = (ImageButton)findViewById(R.id.pizzuu);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Payment_details.this,Settings.class);
                startActivity(i);
            }
        });

        Button butt = (Button)findViewById(R.id.but2);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Payment_details.this,Savechanges.class);
                startActivity(i2);
            }
        });
    }
}


