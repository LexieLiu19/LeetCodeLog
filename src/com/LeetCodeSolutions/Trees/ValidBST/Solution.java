package com.LeetCodeSolutions.Trees.ValidBST;

import com.LeetCodeSolutions.Trees.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, null, null);
    }


    private boolean dfs(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.val <= min) || (max != null && root.val >= max))
            return false;
        return dfs(root.left, root.val, max) && dfs(root.right, min, root.val);
    }

}
