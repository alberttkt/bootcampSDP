package com.github.alberttkt.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendGreetings(View view) {
        System.out.println("Button clicked");
        // we need to open the GreetingActivity when the button is clicked
        Intent intent = new Intent(this, GreetingActivity.class);
        String value = ((EditText) findViewById(R.id.mainText)).getText().toString();
        intent.putExtra("key", value);

        startActivity(intent);

    }
}