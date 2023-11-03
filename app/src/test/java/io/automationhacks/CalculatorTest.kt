package io.automationhacks

import com.example.junit_test.Calculator
import org.junit.Test
import org.junit.jupiter.api.Assertions.*


class CalculatorTest {

    @Test

    fun add() {
        val calculator = Calculator()
        val expected = 10
        assertEquals(expected, calculator.add(5, 5))
    }
}
