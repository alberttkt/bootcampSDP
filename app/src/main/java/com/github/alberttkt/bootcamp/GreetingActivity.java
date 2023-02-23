
package com.github.alberttkt.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("GreetingActivity.onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        // set the value of text field with id "greetingText" to the value of "key"
        System.out.println("GreetingActivity.onCreate: value = " + value);
        String greeting = "Welcome "+value + "!";
        ((TextView) findViewById(R.id.greetingMessage)).setText(greeting);



    }

}
        //Intent intent = getIntent();
        //String value = intent.getStringExtra("key");
        // set the value of text field with id "greetingText" to the value of "key"
        //String greeting = "Welcome "+value + "!";
        //((TextView) findViewById(R.id.greetingMessage)).setText(greeting);

