package jp.yattom.androidnew;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("jp.yattom.androidnew", appContext.getPackageName());
    }

    @Test
    public void 基本動作のテスト() {
        // 「今何してる？」と聞く
        // 「開発中」と答える
        // また「今何してる？」と聞く
        // 「読書中」と答える
        //  あとで、「開発中:読書中=50:50」と表示する
    }
}
