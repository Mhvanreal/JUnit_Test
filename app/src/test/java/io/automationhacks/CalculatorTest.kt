package io.automationhacks

import com.example.junit_test.Calculator
import org.junit.Test
import org.junit.jupiter.api.Assertions.*


class CalculatorTest {


    // metode pengujian untuk menguji metode add dari kelas calculaotr
    @Test
    // membuat objek kelas calculator
    fun add() {
        val calculator = Calculator()
        // menentukan hasil yang diharapkan dari penjumlahan 5+6
        val expected = 10
        //memeriksa apakah hasil dari metode add adalah sesuai dengan yang diharapkan
        assertEquals(expected, calculator.add(5, 5))
    }
}
