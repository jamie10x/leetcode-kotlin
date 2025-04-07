package tests.easy

import problems.easy.TwoSum
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFailsWith

/**
 * This test class validates both the brute-force and optimized implementations
 * of the Two Sum problem.
 *
 * The tests cover:
 * 1. Standard examples provided in the problem statement.
 * 2. A scenario where no valid solution exists, ensuring the functions throw an exception.
 */
class TwoSumTest {

    // Tests for the brute force implementation

    @Test
    fun testTwoSumBruteForce_example1() {
        // Given input: [2,7,11,15] with target 9
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        // Expected output: indices [0, 1] because nums[0] + nums[1] = 9
        val expected = intArrayOf(0, 1)
        val result = TwoSum.twoSumBruteForce(nums, target)
        // Check if the result matches the expected indices
        assertContentEquals(expected, result)
    }

    @Test
    fun testTwoSumBruteForce_example2() {
        // Given input: [3,2,4] with target 6
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        // Expected output: indices [1, 2]
        val expected = intArrayOf(1, 2)
        val result = TwoSum.twoSumBruteForce(nums, target)
        assertContentEquals(expected, result)
    }

    @Test
    fun testTwoSumBruteForce_example3() {
        // Given input: [3,3] with target 6
        val nums = intArrayOf(3, 3)
        val target = 6
        // Expected output: indices [0, 1]
        val expected = intArrayOf(0, 1)
        val result = TwoSum.twoSumBruteForce(nums, target)
        assertContentEquals(expected, result)
    }

    // Test to ensure that if no solution exists, an exception is thrown.
    @Test
    fun testTwoSumBruteForce_noSolution() {
        val nums = intArrayOf(1, 2, 3)
        val target = 7
        // Expecting an IllegalArgumentException because no two numbers add up to 7.
        assertFailsWith<IllegalArgumentException> {
            TwoSum.twoSumBruteForce(nums, target)
        }
    }

    // Tests for the optimized (HashMap) implementation

    @Test
    fun testTwoSumOptimized_example1() {
        // Given input: [2,7,11,15] with target 9
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        // Expected output: indices [0, 1]
        val expected = intArrayOf(0, 1)
        val result = TwoSum.twoSumOptimized(nums, target)
        assertContentEquals(expected, result)
    }

    @Test
    fun testTwoSumOptimized_example2() {
        // Given input: [3,2,4] with target 6
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        // Expected output: indices [1, 2]
        val expected = intArrayOf(1, 2)
        val result = TwoSum.twoSumOptimized(nums, target)
        assertContentEquals(expected, result)
    }

    @Test
    fun testTwoSumOptimized_example3() {
        // Given input: [3,3] with target 6
        val nums = intArrayOf(3, 3)
        val target = 6
        // Expected output: indices [0, 1]
        val expected = intArrayOf(0, 1)
        val result = TwoSum.twoSumOptimized(nums, target)
        assertContentEquals(expected, result)
    }

    @Test
    fun testTwoSumOptimized_noSolution() {
        val nums = intArrayOf(1, 2, 3)
        val target = 7
        // Expecting an IllegalArgumentException because no two numbers add up to 7.
        assertFailsWith<IllegalArgumentException> {
            TwoSum.twoSumOptimized(nums, target)
        }
    }
}
