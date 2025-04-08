package tests.easy

import problems.easy.PalindromeNumber
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

/**
 * This test class validates both the string conversion and optimized numeric implementations
 * of the Palindrome Number problem.
 *
 * The tests include:
 * 1. Standard examples as provided in the problem description.
 * 2. Edge cases such as negative numbers and numbers with trailing zeros.
 */
class PalindromeNumberTest {

    // Tests for the String Conversion Approach

    @Test
    fun testIsPalindromeString_palindrome() {
        // 121 is a palindrome.
        assertTrue(PalindromeNumber.isPalindromeString(121))
    }

    @Test
    fun testIsPalindromeString_negative() {
        // -121 is not a palindrome.
        assertFalse(PalindromeNumber.isPalindromeString(-121))
    }

    @Test
    fun testIsPalindromeString_trailingZero() {
        // 10 is not a palindrome due to trailing zero.
        assertFalse(PalindromeNumber.isPalindromeString(10))
    }

    // Tests for the Optimized Numeric Approach

    @Test
    fun testIsPalindromeOptimized_palindrome() {
        // 121 is a palindrome.
        assertTrue(PalindromeNumber.isPalindromeOptimized(121))
    }

    @Test
    fun testIsPalindromeOptimized_negative() {
        // -121 is not a palindrome.
        assertFalse(PalindromeNumber.isPalindromeOptimized(-121))
    }

    @Test
    fun testIsPalindromeOptimized_trailingZero() {
        // 10 is not a palindrome due to trailing zero.
        assertFalse(PalindromeNumber.isPalindromeOptimized(10))
    }
}
