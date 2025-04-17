package problems.easy

/**
 * LeetCode Problem 27: Remove Element
 * Link: https://leetcode.com/problems/remove-element/
 *
 * Problem Description:
 * --------------------
 * Given an integer array `nums` and an integer `val`, remove **all** occurrences of `val`
 * **in‑place** and return the new length `k` of the array such that the first `k` elements
 * are the ones **not** equal to `val`.
 * The order of the remaining elements may change, and anything beyond the first `k`
 * positions is irrelevant.
 *
 * Examples:
 * - nums = [3,2,2,3], val = 3  →  k = 2, nums = [2,2,_,_]
 * - nums = [0,1,2,2,3,0,4,2], val = 2  →  k = 5, nums = [0,1,4,0,3,_,_,_]
 *
 * Constraints:
 * 0 ≤ nums.length ≤ 100
 * 0 ≤ nums[i] ≤ 50
 * 0 ≤ val ≤ 100
 *
 * --------------------
 * Approach Explanation (Two‑Pointer / Write‑Index):
 *
 * 1. Maintain a pointer `insertPos` that indicates where the next non‑`val` element
 *    should be placed.
 * 2. Scan each element in `nums`:
 *      • If the element ≠ `val`, write it at `nums[insertPos]` and increment `insertPos`.
 * 3. After the loop, `insertPos` equals the count of valid elements (`k`).
 *
 * Time Complexity:  O(n) – one pass through the array.
 * Space Complexity: O(1) – in‑place, only constant extra space.
 */
object RemoveElement {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var insertPos = 0
        for (num in nums) {
            if (num != `val`) {
                nums[insertPos] = num
                insertPos++
            }
        }
        return insertPos
    }
}
