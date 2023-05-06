package class15.homework_class15;

public class LeetCode {

/*
Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128]; // 128 is the number of ASCII characters

        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode obj = new LeetCode();
        String s = "abcabcbb";
        System.out.println(LeetCode.lengthOfLongestSubstring(s));
    }
}