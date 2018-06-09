package group4.csci3130.csci3130_assignment2;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);


    @Test
    public void strongPassword() {
        onView(withId(R.id.passwordText)).perform(typeText("StrongPassword1@"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.validationText)).check(matches(withText("Strong")));
    }

    @Test
    public void onlyPassword() {
        onView(withId(R.id.passwordText)).perform(typeText("password"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.validationText)).check(matches(withText("Not Strong")));
    }
}
