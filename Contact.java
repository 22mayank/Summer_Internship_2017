package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        final TextView tv1 = (TextView)findViewById(R.id.tv);
        final TextView tv12 = (TextView)findViewById(R.id.tvv);
        Button b1 = (Button)findViewById(R.id.but1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Thank you for your message, we will");
                tv12.setText(" respond to you as soon as possible!");
            }
        });

        Button b2 = (Button)findViewById(R.id.but2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contact.this,Settings.class);
                startActivity(i);
            }
        });

        ImageButton im = (ImageButton)findViewById(R.id.pizzuu);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Contact.this,Settings.class);
                startActivity(i);
            }
        });
    }
}
