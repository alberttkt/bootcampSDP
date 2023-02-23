package com.github.alberttkt.bootcamp;

import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
// import allOf
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.espresso.Espresso;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> testRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void InputNameAndPress() {
        // check that a intent is sent to GreetingActivity
        Intents.init();
        Espresso.onView(withId(R.id.mainText)).perform(ViewActions.typeText("Albert"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.mainGoButton)).perform(ViewActions.click());

        /*
        To catch intents, tests should begin by calling Intents.init() and end by calling Intents.release(), then use intended(...) with a matcher for the intent
You will likely want the allOf matcher combining some IntentMatchers
To test the intent goes to the right activity, use hasComponent(GreetingActivity.class.getName())
        * */
        Intents.intended(allOf(hasComponent(GreetingActivityTest.class.getName())));
        Intents.release();



    }
}