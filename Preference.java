package com.mayankags.impulse;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;


public class Preference extends AppCompatActivity{

    ImageButton i1,i2,i3,i4;
    LinearLayout lin,lin2,lin3,lin4,lin5,lin6,lin7,lin8,lin9;
    Button b1,b2,b3,b4,b6,b7,b8,b_monday,b_tuesday,b_wed,b_thurs,b_fri,b_sat,b_sun,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
    String col = "#ffab40";
    String orange = "#e57d00";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);



        lin=(LinearLayout)findViewById(R.id.LLLL);
        lin2=(LinearLayout)findViewById(R.id.LLHUHU);
        lin3=(LinearLayout)findViewById(R.id.LULLU);
        lin4=(LinearLayout)findViewById(R.id.LULLU2);
        lin5=(LinearLayout)findViewById(R.id.LULLU3);
        lin6=(LinearLayout)findViewById(R.id.LULLU4);
        lin7=(LinearLayout)findViewById(R.id.LULLU5);
        lin8=(LinearLayout)findViewById(R.id.LULLU6);
        lin9=(LinearLayout)findViewById(R.id.LULLU7);

        i1= (ImageButton)findViewById(R.id.dropdown);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setBackgroundResource(R.drawable.bb2);
                lin.setVisibility(1);
            }
        });
        b1=(Button)findViewById(R.id.always);
        b2=(Button)findViewById(R.id.choosetimes);
        b_monday=(Button)findViewById(R.id.monday);
        b_tuesday=(Button)findViewById(R.id.tuesday);
        b_wed=(Button)findViewById(R.id.wed);
        b_thurs=(Button)findViewById(R.id.thursday);
        b_fri=(Button)findViewById(R.id.friday);
        b_sat=(Button)findViewById(R.id.sat);
        b_sun=(Button)findViewById(R.id.sun);

        b6=(Button)findViewById(R.id.time1);
        b7=(Button)findViewById(R.id.time2);
        b8=(Button)findViewById(R.id.time3);
        b9=(Button)findViewById(R.id.time4);
        b10=(Button)findViewById(R.id.time5);
        b11=(Button)findViewById(R.id.time6);
        b12=(Button)findViewById(R.id.time7);
        b13=(Button)findViewById(R.id.time8);
        b14=(Button)findViewById(R.id.time9);
        b15=(Button)findViewById(R.id.time10);
        b16=(Button)findViewById(R.id.time11);
        b17=(Button)findViewById(R.id.time12);
        b18=(Button)findViewById(R.id.time13);
        b19=(Button)findViewById(R.id.time14);
        b20=(Button)findViewById(R.id.time15);
        b21=(Button)findViewById(R.id.time16);
        b22=(Button)findViewById(R.id.time17);
        b23=(Button)findViewById(R.id.time18);
        b24=(Button)findViewById(R.id.time19);
        b25=(Button)findViewById(R.id.time20);
        b26=(Button)findViewById(R.id.time21);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coocoo();
                b2.setBackgroundColor(Color.parseColor(col));
                b2.setTextColor(Color.WHITE);
                lin2.setVisibility(View.GONE);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coocoo2();
                b1.setBackgroundColor(Color.parseColor(col));
                b1.setTextColor(Color.WHITE);
                lin2.setVisibility(1);

            }
        });


        i2 = (ImageButton)findViewById(R.id.pizzuu);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Preference.this,Settings.class);
                startActivity(i);
            }
        });

        b3=(Button)findViewById(R.id.savechanges);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Preference.this,"CHANGES SAVED",Toast.LENGTH_SHORT).show();
            }
        });

        b4=(Button)findViewById(R.id.nochangeneeded);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Preference.this,Settings.class);
                startActivity(i);
            }
        });

        b_monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin3.setVisibility(1);



                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b6.setBackgroundColor(Color.WHITE);
                        b6.setTextColor(Color.parseColor(col));
                    }
                });

                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b7.setBackgroundColor(Color.WHITE);
                        b7.setTextColor(Color.parseColor(col));
                    }
                });

                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b8.setBackgroundColor(Color.WHITE);
                        b8.setTextColor(Color.parseColor(col));
                    }
                });

                }
        });

        b_tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin4.setVisibility(1);



                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b9.setBackgroundColor(Color.WHITE);
                        b9.setTextColor(Color.parseColor(col));
                    }
                });

                b10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b10.setBackgroundColor(Color.WHITE);
                        b10.setTextColor(Color.parseColor(col));
                    }
                });

                b11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b11.setBackgroundColor(Color.WHITE);
                        b11.setTextColor(Color.parseColor(col));
                    }
                });

            }
        });

        b_wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin5.setVisibility(1);



                b12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b12.setBackgroundColor(Color.WHITE);
                        b12.setTextColor(Color.parseColor(col));
                    }
                });

                b13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b13.setBackgroundColor(Color.WHITE);
                        b13.setTextColor(Color.parseColor(col));
                    }
                });

                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b14.setBackgroundColor(Color.WHITE);
                        b14.setTextColor(Color.parseColor(col));
                    }
                });

            }
        });

        b_thurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin6.setVisibility(1);



                b15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b15.setBackgroundColor(Color.WHITE);
                        b15.setTextColor(Color.parseColor(col));
                    }
                });

                b16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b16.setBackgroundColor(Color.WHITE);
                        b16.setTextColor(Color.parseColor(col));
                    }
                });

                b17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b17.setBackgroundColor(Color.WHITE);
                        b17.setTextColor(Color.parseColor(col));
                    }
                });

            }
        });

        b_fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin7.setVisibility(1);



                b18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b18.setBackgroundColor(Color.WHITE);
                        b18.setTextColor(Color.parseColor(col));
                    }
                });

                b19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b19.setBackgroundColor(Color.WHITE);
                        b19.setTextColor(Color.parseColor(col));
                    }
                });

                b20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b20.setBackgroundColor(Color.WHITE);
                        b20.setTextColor(Color.parseColor(col));
                    }
                });

            }
        });

        b_sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin8.setVisibility(1);



                b21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b21.setBackgroundColor(Color.WHITE);
                        b21.setTextColor(Color.parseColor(col));
                    }
                });

                b22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b22.setBackgroundColor(Color.WHITE);
                        b22.setTextColor(Color.parseColor(col));
                    }
                });

                b23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b23.setBackgroundColor(Color.WHITE);
                        b23.setTextColor(Color.parseColor(col));
                    }
                });

            }
        });


        b_sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin9.setVisibility(1);



                b24.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b24.setBackgroundColor(Color.WHITE);
                        b24.setTextColor(Color.parseColor(col));
                    }
                });

                b25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b25.setBackgroundColor(Color.WHITE);
                        b25.setTextColor(Color.parseColor(col));
                    }
                });

                b26.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        b26.setBackgroundColor(Color.WHITE);
                        b26.setTextColor(Color.parseColor(col));
                    }
                });

            }
        });

    }

    public void coocoo()
    {
        b1.setBackgroundColor(Color.WHITE);
        b1.setTextColor(Color.parseColor(orange));
    }



    public void coocoo2()
    {
        b2.setBackgroundColor(Color.WHITE);
        b2.setTextColor(Color.parseColor(orange));
    }

}
