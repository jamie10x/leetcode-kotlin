package tests.easy

import problems.easy.RemoveElement
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Unit tests for LeetCode 27 – Remove Element.
 *
 * The tests mirror the official examples and verify that:
 * 1. The returned length `k` is correct.
 * 2. The first `k` elements indeed contain no occurrences of `val`.
 */
class RemoveElementTest {

    @Test
    fun example1() {
        val nums = intArrayOf(3, 2, 2, 3)
        val k = RemoveElement.removeElement(nums, 3)
        assertEquals(2, k)
        // Check first k elements contain no 3s
        for (i in 0 until k) assertTrue(nums[i] != 3)
    }

    @Test
    fun example2() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val k = RemoveElement.removeElement(nums, 2)
        assertEquals(5, k)
        for (i in 0 until k) assertTrue(nums[i] != 2)
    }

    @Test
    fun emptyArray() {
        val nums = intArrayOf()
        val k = RemoveElement.removeElement(nums, 1)
        assertEquals(0, k)
    }
}
