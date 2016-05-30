package com.example.studentportal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Electrical extends AppCompatActivity {
    TextView link3s, link3t, link56s, link56t, link78s, link78t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical);

        link3s = (TextView) findViewById(R.id.textView3);
        link3s.setMovementMethod(LinkMovementMethod.getInstance());

        link3t = (TextView) findViewById(R.id.textView4);
        link3t.setMovementMethod(LinkMovementMethod.getInstance());

        link56s = (TextView) findViewById(R.id.textView10);
        link56s.setMovementMethod(LinkMovementMethod.getInstance());

        link56t = (TextView) findViewById(R.id.textView11);
        link56t.setMovementMethod(LinkMovementMethod.getInstance());

        link78s = (TextView) findViewById(R.id.textView16);
        link78s.setMovementMethod(LinkMovementMethod.getInstance());

        link78t = (TextView) findViewById(R.id.textView17);
        link78t.setMovementMethod(LinkMovementMethod.getInstance());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
