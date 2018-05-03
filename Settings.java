package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;


public class Settings extends AppCompatActivity {

    ListView l;
    String [] set = {"EDIT PIZZA & DELIVERY PREFERENCES","EDIT DELIVERY ADDRESS","MANAGE PAYMENT OPTION","REFER A FRIEND","HISTORY","CONTACT US","CHANGE PASSWORD"};
    Integer [] imageset = {R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        CustomListAdapter adapter=new CustomListAdapter(this, set, imageset);
        l = (ListView)findViewById(R.id.l1);
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listtext,set);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position)
            {
                case 0:
                {
                    Intent i1 = new Intent(Settings.this,Preference.class);
                    startActivity(i1);
                    finish();
                    break;
                }
                case 1:
                {
                    Intent i2 = new Intent(Settings.this,Change_Address.class);
                    startActivity(i2);
                    finish();
                    break;
                }
                case 2:
                {
                    Intent i3 = new Intent(Settings.this,Payment_details.class);
                    startActivity(i3);
                    finish();
                    break;
                }
                case 3:
                {
                    Intent i4 = new Intent(Settings.this,Refer.class);
                    startActivity(i4);
                    finish();
                    break;
                }
                case 4:
                {

                    Intent i5 = new Intent(Settings.this,History.class);
                    startActivity(i5);
                    finish();
                    break;
                }
                case 5:
                {
                    Intent i6 = new Intent(Settings.this,Contact.class);
                    startActivity(i6);
                    finish();
                    break;
                }
                case 6:
                {
                    Intent i7 = new Intent(Settings.this,ChangePass.class);
                    startActivity(i7);
                    finish();
                    break;
                }

            }
            }
        });

        ImageButton iii = (ImageButton)findViewById(R.id.pizz);
        iii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Settings.this,Login_1.class);
                startActivity(i);
            }
        });

    }
}
