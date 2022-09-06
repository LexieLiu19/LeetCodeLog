package com.LeetCodeSolutions.Trees.LCAOfBinaryTree;

import com.LeetCodeSolutions.Trees.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);// find p or q in left side
        TreeNode right = lowestCommonAncestor(root.right, p, q);


        if (left != null && right != null) return root; //p和q分布与左右两边，所以返回root
        if (left != null) return left;
        return right;
    }
}
