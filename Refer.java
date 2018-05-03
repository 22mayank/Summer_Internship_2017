package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;



public class Refer extends AppCompatActivity {

    ImageButton i;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refer);
        i=(ImageButton)findViewById(R.id.huha);
        b1=(Button)findViewById(R.id.send);
        b2=(Button)findViewById(R.id.copy);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(Refer.this,Settings.class);
                startActivity(ii);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Refer.this,"INVITE SENT",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Refer.this,"CODE COPIED",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
