package tests.easy

import problems.easy.RomanToInteger
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * This test class validates the Roman to Integer implementation.
 *
 * The tests include:
 * 1. Standard examples as provided in the problem description.
 */
class RomanToIntegerTest {

    @Test
    fun testExample1() {
        // Example 1: "III" should return 3.
        val result = RomanToInteger.romanToInt("III")
        assertEquals(3, result)
    }

    @Test
    fun testExample2() {
        // Example 2: "LVIII" should return 58.
        val result = RomanToInteger.romanToInt("LVIII")
        assertEquals(58, result)
    }

    @Test
    fun testExample3() {
        // Example 3: "MCMXCIV" should return 1994.
        val result = RomanToInteger.romanToInt("MCMXCIV")
        assertEquals(1994, result)
    }
}
