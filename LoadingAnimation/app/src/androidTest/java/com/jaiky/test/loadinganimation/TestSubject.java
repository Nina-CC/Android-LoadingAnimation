package com.jaiky.test.loadinganimation;

import android.test.InstrumentationTestCase;

/**
 * Created by Jaiky on 9/20/2016.
 */
public class TestSubject extends InstrumentationTestCase {

    private static final String LOG_TAG = "test";

    public void testPublishSubject() {
        launchActivity("com.jaiky.test.loadinganimation", MainActivity.class, null);
    }

}
