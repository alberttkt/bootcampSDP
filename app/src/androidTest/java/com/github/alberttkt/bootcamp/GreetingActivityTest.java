package com.github.alberttkt.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.app.Activity;
import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Test
    public void WellCreated() {
        // create an intent with the key "key" and value "Albert"
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        intent.putExtra("key", "Albert");
        // create a GreetingActivity with the intent
        ActivityScenario<Activity> scenario= ActivityScenario.launch(intent);
        // check that the text field with id "greetingMessage" has the value "Welcome Albert!"
        onView(withId(R.id.greetingMessage)).check(matches(withText("Welcome Albert!")));
        scenario.close();





    }

}
