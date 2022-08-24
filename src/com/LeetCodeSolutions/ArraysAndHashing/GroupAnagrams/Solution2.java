package com.LeetCodeSolutions.ArraysAndHashing.GroupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String[] strs = {"he", "eh", "are", "rea"};
        System.out.println(s.groupAnagrams(strs));

    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> result = new HashMap<>();
        for (String s : strs) {
            int[] countTable = new int[26];
            for (char c : s.toCharArray()) {
                countTable[c - 'a']++; // index of c, eg. 'a' = 0, 'b' = 1;
            }

            StringBuilder sb = new StringBuilder();
            for (int count : countTable) {
                sb.append("#");
                sb.append(count); //eg "#010200...000" == "bdd";
            }
            String key = sb.toString();
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }

            result.get(key).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
