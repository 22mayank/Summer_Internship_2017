package com.mayankags.impulse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.mayankags.impulse.adapters.SplashViewPager;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    int images[] = {R.drawable.pizza_boxes, R.drawable.image_2, R.drawable.image_3};
    SplashViewPager myCustomPagerAdapter;



    public void signup(View view){

        Log.i("Sign Up:","Successful");

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

       Button b1=(Button)findViewById(R.id.login);
        Button b2=(Button)findViewById(R.id.signup);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Login.class);
                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,Signup.class);
                startActivity(i1);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        viewPager = (ViewPager) findViewById(R.id.viewpager_images_splash);

        myCustomPagerAdapter = new SplashViewPager(MainActivity.this, images);
        viewPager.setAdapter(myCustomPagerAdapter);
    }
}
