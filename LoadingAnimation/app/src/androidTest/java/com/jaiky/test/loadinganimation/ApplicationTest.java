package com.jaiky.test.loadinganimation;

import android.app.Application;
import android.renderscript.Int2;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void test() throws Exception {
        int in = 1;
        int in2 = 1;
        assertEquals(in, in2);
    }





}