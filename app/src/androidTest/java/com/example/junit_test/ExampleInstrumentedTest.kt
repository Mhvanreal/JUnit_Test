package com.example.junit_test

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    // metode pengujian
    @Test
    fun useAppContext() {
        // Context of the app under test.

        //mendapatkan konteks aplikasi dari perangkat di bawah pengujian
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        // memeriksa apakah nama paket aplikasi adalah com.example.junit_test
        assertEquals("com.example.junit_test", appContext.packageName)
    }
}