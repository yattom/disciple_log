package jp.yattom.androidnew;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
     public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("jp.yattom.androidnew", appContext.getPackageName());
    }

    @Test
    public void 基本動作のテスト() {
        // 「今何してる？」と聞く
        onView(withId(R.id.to_record)).perform(ViewActions.click());
        onView(withText("Record Now!")).check(ViewAssertions.matches(isDisplayed()));
        // 「開発中」と答える
        onView(withText("開発中")).perform(ViewActions.click());
        // また「今何してる？」と聞く
        // 「読書中」と答える
        //  あとで、「開発中:読書中=50:50」と表示する
    }
}
