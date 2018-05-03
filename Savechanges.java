package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;



public class Savechanges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changedetails);

        ImageButton im = (ImageButton)findViewById(R.id.sa);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Savechanges.this,Payment_details.class);
                startActivity(i);
            }
        });

        Button b_save = (Button)findViewById(R.id.save);
        b_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Savechanges.this,"DETAILS SAVED",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
