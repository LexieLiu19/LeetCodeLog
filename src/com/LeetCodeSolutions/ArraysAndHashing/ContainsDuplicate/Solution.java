package com.LeetCodeSolutions.ArraysAndHashing.ContainsDuplicate;


import java.util.HashSet;
import java.util.Set;

public class Solution {


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 4, 3};
        System.out.println(s.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> unique = new HashSet<>();

        for (var num : nums) {
            if (unique.contains(num)) return true;
            unique.add(num);
        }

        return false;
    }
}
