package com.example.studentportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Departments extends AppCompatActivity {
    Button edit_Button2, edit_Button3, edit_Button4, edit_Button8, edit_Button6, edit_Button5, edit_Button7, edit_Button9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        edit_Button2 = (Button) findViewById(R.id.button2);
        edit_Button3 = (Button) findViewById(R.id.button3);
        edit_Button4 = (Button) findViewById(R.id.button4);
        edit_Button8 = (Button) findViewById(R.id.button8);
        edit_Button6 = (Button) findViewById(R.id.button6);
        edit_Button5 = (Button) findViewById(R.id.button5);
        edit_Button7 = (Button) findViewById(R.id.button7);
        edit_Button9 = (Button) findViewById(R.id.button9);

        edit_Button2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View arg0) {
                                                edit_Button2.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        startActivity(new Intent(Departments.this, ComputerScience.class));
                                                                                    }
                                                                                }
                                                );
                                            }
                                        }
        );
                edit_Button3.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View arg0) {
                                                        edit_Button3.setOnClickListener(new View.OnClickListener() {
                                                                                            @Override
                                                                                            public void onClick(View v) {
                                                                                                startActivity(new Intent(Departments.this, InformationScience.class));
                                                                                            }
                                                                                        }
                                                        );
                                                    }
                                                }

                );

        edit_Button4.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View arg0) {
                                                edit_Button4.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        startActivity(new Intent(Departments.this, Electrical.class));
                                                                                    }
                                                                                }
                                                );
                                            }
                                        }

        );

        edit_Button8.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View arg0) {
                                                edit_Button8.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        startActivity(new Intent(Departments.this, Civil.class));
                                                                                    }
                                                                                }
                                                );
                                            }
                                        }

        );

        edit_Button6.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View arg0) {
                                                edit_Button6.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        startActivity(new Intent(Departments.this, Mechanical.class));
                                                                                    }
                                                                                }
                                                );
                                            }
                                        }
        );


        edit_Button5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View arg0) {
                                                edit_Button5.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        startActivity(new Intent(Departments.this, Electronics.class));
                                                                                    }
                                                                                }
                                                );
                                            }
                                        }
        );

        edit_Button7.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View arg0) {
                                                edit_Button7.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        startActivity(new Intent(Departments.this, Chemical.class));
                                                                                    }
                                                                                }
                                                );
                                            }
                                        }
        );


        edit_Button9.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View arg0) {
                                                edit_Button9.setOnClickListener(new View.OnClickListener() {
                                                                                    @Override
                                                                                    public void onClick(View v) {
                                                                                        startActivity(new Intent(Departments.this, Common.class));
                                                                                    }
                                                                                }
                                                );
                                            }
                                        }
        );

    }
}