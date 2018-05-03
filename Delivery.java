package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;



public class Delivery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delivery);

        ImageButton b= (ImageButton)findViewById(R.id.pizz);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Delivery.this,Signup.class);
                startActivity(i);
            }
        });
        ImageButton n = (ImageButton)findViewById(R.id.nn);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Delivery.this,Credit.class);
                startActivity(i2);
            }
        });

        Button bb = (Button)findViewById(R.id.butttt1);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout ll = (LinearLayout)findViewById(R.id.lin1);
                ll.setVisibility(View.GONE);
                LinearLayout l2 = (LinearLayout)findViewById(R.id.lin2);
                l2.setVisibility(View.GONE);
            }
        });



    }
}
