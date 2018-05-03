package com.mayankags.impulse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton b1=(ImageButton)findViewById(R.id.back_button);
        ImageButton b2=(ImageButton)findViewById(R.id.forg);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Login.this,MainActivity.class);
            startActivity(i);
        }
    });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,Forgot.class);
                startActivity(i);
            }
        });

        Button b3=(Button)findViewById(R.id.logg);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,Login_1.class);
                startActivity(i);
            }
        });
    }



}
