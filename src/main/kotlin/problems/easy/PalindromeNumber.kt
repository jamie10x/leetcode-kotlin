package problems.easy

/**
 * LeetCode Problem: Palindrome Number
 * Link: https://leetcode.com/problems/palindrome-number/
 *
 * Problem Description:
 * --------------------
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 *
 * Constraints:
 * - -2^31 <= x <= 2^31 - 1
 *
 * Follow Up: Could you solve it without converting the integer to a string?
 *
 * --------------------
 * Approach Explanations:
 *
 * 1. String Conversion Approach:
 *    - Convert the integer to a string and compare it with its reversed version.
 *    - Time Complexity: O(n), where n is the number of digits.
 *    - Space Complexity: O(n) due to the string representation.
 *
 * 2. Optimized Numeric Approach (Reverse Half of the Number):
 *    - Without converting to a string, reverse the latter half of the number.
 *    - Compare the reversed half with the remaining half.
 *    - Time Complexity: O(log₁₀(n)) since the number of digits is proportional to log₁₀(x).
 *    - Space Complexity: O(1) as only a few extra variables are used.
 */
object PalindromeNumber {

    /**
     * String Conversion Approach
     *
     * Converts the integer to a string and checks if it reads the same backwards.
     *
     * @param x An integer to be evaluated.
     * @return True if x is a palindrome, false otherwise.
     */
    fun isPalindromeString(x: Int): Boolean {
        if (x < 0) return false
        val s = x.toString()
        return s == s.reversed()
    }

    /**
     * Optimized Numeric Approach (Reverse Half)
     *
     * Reverses half of the digits and compares with the other half.
     *
     * @param x An integer to be evaluated.
     * @return True if x is a palindrome, false otherwise.
     */
    fun isPalindromeOptimized(x: Int): Boolean {
        // Negative numbers are not palindromic; also, any number ending in 0 (except 0 itself) can't be a palindrome.
        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var xVar = x
        var reversed = 0

        // Reverse half of the number.
        while (xVar > reversed) {
            reversed = reversed * 10 + (xVar % 10)
            xVar /= 10
        }
        // For an even number of digits, xVar should equal reversed.
        // For an odd number of digits, ignore the middle digit by reversed / 10.
        return xVar == reversed || xVar == reversed / 10
    }
}
