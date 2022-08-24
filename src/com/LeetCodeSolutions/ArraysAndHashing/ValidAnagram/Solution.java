package com.LeetCodeSolutions.ArraysAndHashing.ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        Solution s = new Solution();
        System.out.println(s.isAnagram(s1, s2));

        String s3 = "rat";
        String s4 = "cat";
        System.out.println(s.isAnagram(s3, s4));


    }

    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;


        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            if (map.containsKey(sChar)) {
                map.put(sChar, map.get(sChar) + 1);
            } else {
                map.put(sChar, 1);
            }

            char tChar = t.charAt(i);

            if (map.containsKey(tChar)) {
                map.put(tChar, map.get(tChar) - 1);
            } else {
                map.put(tChar, -1);
            }
        }


        for (int count : map.values()) {
            if (count != 0) return false;
        }

        return true;
    }
}
