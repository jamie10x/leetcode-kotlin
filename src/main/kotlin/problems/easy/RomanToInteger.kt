package problems.easy

/**
 * LeetCode Problem: Roman to Integer
 * Link: https://leetcode.com/problems/roman-to-integer/
 *
 * Problem Description:
 * --------------------
 * Roman numerals are represented by seven symbols: I, V, X, L, C, D, M.
 * The value of a Roman numeral is determined by adding the values of its symbols,
 * with a subtractive rule for cases where a smaller numeral precedes a larger one.
 *
 * Examples:
 * - "III"    → 3
 * - "LVIII"  → 58 (L = 50, V = 5, III = 3)
 * - "MCMXCIV"→ 1994 (M = 1000, CM = 900, XC = 90, IV = 4)
 *
 * Constraints:
 * 1 <= s.length <= 15 and s consists only of the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 *
 * --------------------
 * Approach Explanations:
 *
 * 1. Create a map of Roman numeral characters to their integer values.
 * 2. Iterate through the input string; compare the current numeral's value with the next numeral's value.
 *    - If the current numeral is smaller than the next, subtract its value.
 *    - Otherwise, add its value.
 *
 * Time Complexity: O(n), where n is the length of the string.
 * Space Complexity: O(1), since the mapping size is fixed.
 */
object RomanToInteger {

    fun romanToInt(s: String): Int {
        val values = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var result = 0

        // Iterate through the string until the second to last character.
        for (i in 0 until s.length - 1) {
            val current = values[s[i]]!!
            val next = values[s[i + 1]]!!
            if (current < next) {
                result -= current
            } else {
                result += current
            }
        }

        // Add the last character's value.
        result += values[s.last()]!!

        return result
    }
}
