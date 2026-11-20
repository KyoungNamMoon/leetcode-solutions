/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        int current = 0;
        return dfs(root, targetSum, current);
        
    }
    private boolean dfs(TreeNode root, int targetSum, int current) {
        if (root == null) {
            return false;
        }
        current += root.val;
        if (current == targetSum && (root.left == null && root.right == null)) {
            return true;
        }
        return dfs(root.left, targetSum, current) || dfs(root.right, targetSum, current);

    }
}