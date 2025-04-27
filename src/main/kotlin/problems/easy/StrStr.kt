package problems.easy

/**
 * LeetCode Problem: Find the Index of the First Occurrence in a String
 * Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 *
 * Problem Description:
 * --------------------
 * Given two strings `needle` and `haystack`, return the index of the first occurrence
 * of `needle` in `haystack`, or -1 if `needle` is not part of `haystack`.
 *
 * Examples:
 * - haystack = "sadbutsad", needle = "sad" → returns 0
 * - haystack = "leetcode", needle = "leeto" → returns -1
 *
 * --------------------
 * Approach Explanation:
 *
 * 1. Edge case: If `needle` is empty, return 0.
 * 2. Iterate from index 0 to haystack.length - needle.length.
 * 3. At each index, compare the substring of haystack with needle.
 * 4. Return the index at first match, or -1 if no match is found.
 *
 * Alternative:
 * Use Kotlin's built-in `indexOf()` which does the same thing with internal optimizations.
 *
 * Time Complexity: O(n * m) in the naive approach, where n = haystack length, m = needle length.
 * Space Complexity: O(1) if using regionMatches (no new substrings allocated).
 */
object StrStr {

    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0

        val n = haystack.length
        val m = needle.length

        for (i in 0..n - m) {
            if (haystack.regionMatches(i, needle, 0, m)) {
                return i
            }
        }

        return -1
    }
}
