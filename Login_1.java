package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class Login_1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_1);

        Button b1= (Button) findViewById(R.id.log_o);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login_1.this,Login.class);
                startActivity(i);
            }


        });
        ImageButton i1=(ImageButton)findViewById(R.id.sett);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Login_1.this,Settings.class);
                startActivity(i2);
            }
        });

    }
}
