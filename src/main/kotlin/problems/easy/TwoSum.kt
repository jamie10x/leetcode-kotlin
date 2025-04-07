package problems.easy

/**
 * LeetCode Problem: Two Sum
 *
 * Problem Description:
 * --------------------
 * Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 *
 * Constraints:
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 *
 * --------------------
 * Approach Explanation:
 * --------------------
 * 1. Brute Force Approach:
 *    - Iterate through every possible pair in the array.
 *    - **Time Complexity:** O(n²) due to the nested loops.
 *    - **Space Complexity:** O(1) (excluding output space).
 *
 * 2. Optimized Approach using a HashMap:
 *    - Traverse the array once and store numbers in a hash map.
 *    - For each number, compute its complement (target - number) and check if it exists in the map.
 *    - **Time Complexity:** O(n) because of a single pass through the array.
 *    - **Space Complexity:** O(n) in the worst case (if nearly all numbers are stored).
 *
 * Thinking Process:
 * ------------------
 * - Start by understanding the problem constraints.
 * - Consider a simple brute-force approach and realize its inefficiency for large input sizes.
 * - Improve upon it using a hash map to achieve an O(n) time solution.
 * - Document each step and code block to make the solution easier to understand and maintain.
 */

object TwoSum {

    /**
     * Brute Force Approach
     *
     * This method uses two nested loops to try every pair of numbers in the array.
     * It checks if the sum of any pair equals the target.
     *
     * @param nums Array of integers.
     * @param target The target sum.
     * @return An integer array containing the indices of the two numbers.
     *
     * Time Complexity: O(n²) - due to the nested loops.
     * Space Complexity: O(1) - no extra space apart from the output.
     */
    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
        // Loop through each element using index i.
        for (i in nums.indices) {
            // For each element, check every subsequent element.
            for (j in i + 1 until nums.size) {
                // If the sum of the two elements equals the target, return their indices.
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        // Safeguard: as per the problem statement, there is always exactly one solution.
        throw IllegalArgumentException("No two sum solution exists")
    }

    /**
     * Optimized Approach using a HashMap
     *
     * This method traverses the array once. It stores each number along with its index in a hash map.
     * For every number, it calculates the complement (target - number) and checks if it exists in the map.
     * If the complement is found, it returns the indices.
     *
     * @param nums Array of integers.
     * @param target The target sum.
     * @return An integer array containing the indices of the two numbers.
     *
     * Time Complexity: O(n) - single traversal of the array.
     * Space Complexity: O(n) - worst-case space for the hash map.
     */
    fun twoSumOptimized(nums: IntArray, target: Int): IntArray {
        // Create a mutable map to store numbers as keys and their indices as values.
        val numToIndex = mutableMapOf<Int, Int>()

        // Loop through each element with its index.
        for ((index, num) in nums.withIndex()) {
            // Calculate the complement required to reach the target.
            val complement = target - num

            // Check if the complement exists in the map.
            if (numToIndex.containsKey(complement)) {
                // If found, return the index of the complement and the current index.
                return intArrayOf(numToIndex[complement]!!, index)
            }
            // Otherwise, add the current number and its index to the map.
            numToIndex[num] = index
        }

        // Safeguard: per the problem constraints, this exception should never be thrown.
        throw IllegalArgumentException("No two sum solution exists")
    }
}
