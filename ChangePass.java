package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class ChangePass extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_pass);

        ImageButton i1 = (ImageButton)findViewById(R.id.back);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ChangePass.this,Settings.class);
                startActivity(i);
            }
        });
        ImageButton i2=(ImageButton)findViewById(R.id.reset1);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChangePass.this,"LINK SENT",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
