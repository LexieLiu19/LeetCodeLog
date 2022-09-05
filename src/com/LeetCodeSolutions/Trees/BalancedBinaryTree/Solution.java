package com.LeetCodeSolutions.Trees.BalancedBinaryTree;

import com.LeetCodeSolutions.Trees.TreeNode;

public class Solution {

    public boolean isBalancedTree(TreeNode root) {

        if (root == null) return true;
        return (Math.abs(height(root.left) - height(root.right)) < 2) && isBalancedTree(root.right) && isBalancedTree(root.left);

    }


    private int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);


        return 1 + Math.max(left, right);
    }
}
