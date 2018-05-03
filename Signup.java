package com.mayankags.impulse;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class Signup extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
ImageButton ii = (ImageButton)findViewById(R.id.backpiz);
        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Signup.this,MainActivity.class);
                startActivity(i);
            }
        });
        ImageButton i2 = (ImageButton)findViewById(R.id.next);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2  = new Intent(Signup.this,Delivery.class);
                startActivity(i2);
            }
        });
    }
}