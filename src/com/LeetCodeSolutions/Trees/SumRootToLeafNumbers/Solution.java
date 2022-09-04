package com.LeetCodeSolutions.Trees.SumRootToLeafNumbers;

import com.LeetCodeSolutions.Trees.TreeNode;

public class Solution {


    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);

    }

    private int dfs(TreeNode root, int num) {
        if (root == null) return 0;
        num = num * 10 + root.val;

        if (root.left == null && root.right == null) {
            return num;
        }

        int left = dfs(root.left, num);
        int right = dfs(root.right, num);

        return left + right;
    }


}
