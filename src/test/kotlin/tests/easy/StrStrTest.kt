package tests.easy

import problems.easy.StrStr
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * This test class validates the Find the Index of the First Occurrence in a String implementation.
 *
 * The tests include:
 * 1. Standard examples.
 * 2. Empty needle.
 * 3. Needle not present in haystack.
 * 4. Needle is equal to haystack.
 */
class StrStrTest {

    @Test
    fun testExample1() {
        // haystack = "sadbutsad", needle = "sad" → index 0
        val result = StrStr.strStr("sadbutsad", "sad")
        assertEquals(0, result)
    }

    @Test
    fun testExample2() {
        // haystack = "leetcode", needle = "leeto" → index -1
        val result = StrStr.strStr("leetcode", "leeto")
        assertEquals(-1, result)
    }

    @Test
    fun testEmptyNeedle() {
        // haystack = "abc", needle = "" → index 0 (edge case)
        val result = StrStr.strStr("abc", "")
        assertEquals(0, result)
    }

    @Test
    fun testNeedleIsHaystack() {
        // haystack = "hello", needle = "hello" → index 0
        val result = StrStr.strStr("hello", "hello")
        assertEquals(0, result)
    }

    @Test
    fun testNeedleAtEnd() {
        // haystack = "mississippi", needle = "ppi" → index 8
        val result = StrStr.strStr("mississippi", "ppi")
        assertEquals(8, result)
    }
}
