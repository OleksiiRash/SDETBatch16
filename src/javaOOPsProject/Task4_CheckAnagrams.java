package javaOOPsProject;

public class Task4_CheckAnagrams {

    public static boolean checkAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26]; // Assuming input strings contain only lowercase English alphabets

        // Increment count for each character in str1
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
        }

        // Decrement count for each character in str2
        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i) - 'a']--;
        }

        // If all counts are zero, strings are anagrams
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkAnagrams("listen", "silent"));


    }
}