package com.example.junit_test

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    @org.junit.jupiter.api.Test
    // metode pengujian unit.
    fun addition_isCorrect() {

        // memeriksa apakah hasil penjumlahan 2+2 adalah 4
        assertEquals(4, 2 + 2)
    }
}