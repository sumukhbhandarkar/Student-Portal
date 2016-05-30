package com.example.studentportal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Common extends AppCompatActivity {
    TextView linksp, linktp, linksc, linktc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        linksp = (TextView) findViewById(R.id.textView7);
        linksp.setMovementMethod(LinkMovementMethod.getInstance());

        linktp = (TextView) findViewById(R.id.textView9);
        linktp.setMovementMethod(LinkMovementMethod.getInstance());

        linksc = (TextView) findViewById(R.id.textView12);
        linksc.setMovementMethod(LinkMovementMethod.getInstance());

        linktc = (TextView) findViewById(R.id.textView13);
        linktc.setMovementMethod(LinkMovementMethod.getInstance());

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
    }

}
