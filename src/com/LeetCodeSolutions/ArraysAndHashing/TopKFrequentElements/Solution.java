package com.LeetCodeSolutions.ArraysAndHashing.TopKFrequentElements;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 2, 2, 3};
        Solution s = new Solution();
        s.topKFrequent(nums, 2);

    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(map);
        return nums;

    }
}
