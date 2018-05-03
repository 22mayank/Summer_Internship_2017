package com.mayankags.impulse;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class Change_Address extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delivery_address);

        ImageButton im = (ImageButton)findViewById(R.id.pizza);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Change_Address.this,Settings.class);
                startActivity(i);
            }
        });

        Button b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Change_Address.this,Settings.class);
                startActivity(i1);
            }
        });
        Button b2=(Button)findViewById(R.id.button1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Change_Address.this,"CHANGE SAVED",Toast.LENGTH_SHORT).show();
            }
        });
    }
}