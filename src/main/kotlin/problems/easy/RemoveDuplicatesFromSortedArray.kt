package problems.easy

/**
 * LeetCode Problem: Remove Duplicates from Sorted Array
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Problem Description:
 * --------------------
 * Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. The relative order of the elements should be
 * kept the same. Return the number of unique elements `k`. The first `k` elements of `nums` should
 * contain the unique elements in the order they were present in `nums` initially; the remaining
 * elements are not important.
 *
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 *
 * Example 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 *
 * Constraints:
 * 1 <= nums.length <= 3 * 10^4
 * -100 <= nums[i] <= 100
 * `nums` is sorted in non-decreasing order.
 *
 * --------------------
 * Approach Explanations:
 *
 * 1. Two-Pointer Technique:
 *    - Use one pointer (i) to iterate through the array and another (insertPos) to mark the position
 *      where the next unique element should be placed.
 *    - For each element starting at index 1, if it differs from the previous element, it is a unique
 *      value. Place it at the `insertPos` index.
 *    - Increment `insertPos` each time a unique element is encountered.
 *
 * Time Complexity: O(n), where n is the length of the array.
 * Space Complexity: O(1), since the solution is in-place and uses only a few extra variables.
 */
object RemoveDuplicatesFromSortedArray {

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var insertPos = 1  // Position to insert the next unique element
        for (i in 1 until nums.size) {
            // If the current element is different from the previous, it's unique.
            if (nums[i] != nums[i - 1]) {
                nums[insertPos] = nums[i]
                insertPos++
            }
        }
        return insertPos
    }
}
