package problems.easy

/**
 * LeetCode Problem: Longest Common Prefix
 * Link: https://leetcode.com/problems/longest-common-prefix/
 *
 * Problem Description:
 * --------------------
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Examples:
 * - Input: strs = ["flower","flow","flight"]
 *   Output: "fl"
 * - Input: strs = ["dog","racecar","car"]
 *   Output: ""
 *
 * Constraints:
 * - 1 <= strs.length <= 200
 * - 0 <= strs[i].length <= 200
 * - strs[i] consists of only lowercase English letters if it is non-empty.
 *
 * --------------------
 * Approach Explanations:
 *
 * Horizontal Scanning:
 * 1. Start with the first string as the initial prefix candidate.
 * 2. For each subsequent string, check if it begins with the current prefix.
 *    - If not, trim the prefix by removing the last character until a match is found.
 *    - If the prefix becomes empty, return "" immediately.
 *
 * Time Complexity: O(N * M), where N is the number of strings and M is the average prefix length.
 * Space Complexity: O(1), aside from the input storage.
 */
object LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        // Start with the first string as prefix
        var prefix = strs[0]

        // Compare this prefix with each of the other strings
        for (i in 1 until strs.size) {
            val current = strs[i]
            // Trim the prefix until the current string starts with it
            while (!current.startsWith(prefix)) {
                // Remove the last character from the prefix
                prefix = prefix.dropLast(1)
                if (prefix.isEmpty()) return ""
            }
        }
        return prefix
    }
}
