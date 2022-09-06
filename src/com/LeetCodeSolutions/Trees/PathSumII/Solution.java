package com.LeetCodeSolutions.Trees.PathSumII;

import com.LeetCodeSolutions.Trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<>();
        pathSumHelper(root, target, new ArrayList<Integer>(), res);
        return res;
    }


    private void pathSumHelper(TreeNode root, int target, List<Integer> current, List<List<Integer>> res) {
        if (root == null) return;
        current.add(root.val);
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                res.add(current);
            }
            return;
        }


        pathSumHelper(root.left, target - root.val, new ArrayList<Integer>(current), res);
        pathSumHelper(root.right, target - root.val, new ArrayList<Integer>(current), res);
    }
}
