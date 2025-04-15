package tests.easy

import problems.easy.RemoveDuplicatesFromSortedArray
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * This test class validates the Remove Duplicates from Sorted Array implementation.
 *
 * The tests include:
 * 1. Testing a basic array with duplicates.
 * 2. Testing a longer array with multiple duplicates.
 */
class RemoveDuplicatesFromSortedArrayTest {

    @Test
    fun testExample1() {
        // Example 1: [1,1,2] should return 2 unique elements.
        val nums = intArrayOf(1, 1, 2)
        val k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums)
        assertEquals(2, k)
        // The first k elements should be [1,2]
        assertEquals(1, nums[0])
        assertEquals(2, nums[1])
    }

    @Test
    fun testExample2() {
        // Example 2: [0,0,1,1,1,2,2,3,3,4] should return 5 unique elements.
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums)
        assertEquals(5, k)
        // The first k elements should be [0,1,2,3,4]
        assertEquals(0, nums[0])
        assertEquals(1, nums[1])
        assertEquals(2, nums[2])
        assertEquals(3, nums[3])
        assertEquals(4, nums[4])
    }

    @Test
    fun testSingleElement() {
        // Test edge case: Single element array should return 1.
        val nums = intArrayOf(10)
        val k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums)
        assertEquals(1, k)
        assertEquals(10, nums[0])
    }
}
