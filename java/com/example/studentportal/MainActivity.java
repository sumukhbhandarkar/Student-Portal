package com.example.studentportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button edit_Button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_Button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);

        edit_Button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View arg0) {
          if (editText.getText().toString().equalsIgnoreCase(""))
             Toast.makeText(MainActivity.this, "This Field cannot be empty", Toast.LENGTH_LONG).show();
          else
              Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_LONG).show();
              edit_Button.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                 startActivity(new Intent(MainActivity.this, Departments.class));
                 }
              }
          );
        }   //onClick method
        }   //Edit Button
        );  //end of onClickListener new
        } //end of onCreate
    }  //Main activity ends