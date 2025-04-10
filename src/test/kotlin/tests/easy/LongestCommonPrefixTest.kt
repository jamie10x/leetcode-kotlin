package tests.easy

import problems.easy.LongestCommonPrefix
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * This test class validates the Longest Common Prefix implementation.
 *
 * The tests include:
 * 1. Standard examples provided in the problem description.
 */
class LongestCommonPrefixTest {

    @Test
    fun testExample1() {
        // Example 1: ["flower", "flow", "flight"] should return "fl".
        val strs = arrayOf("flower", "flow", "flight")
        val result = LongestCommonPrefix.longestCommonPrefix(strs)
        assertEquals("fl", result)
    }

    @Test
    fun testExample2() {
        // Example 2: ["dog", "racecar", "car"] should return "".
        val strs = arrayOf("dog", "racecar", "car")
        val result = LongestCommonPrefix.longestCommonPrefix(strs)
        assertEquals("", result)
    }
}
