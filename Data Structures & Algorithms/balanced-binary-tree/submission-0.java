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
    public boolean balanced = true;

    public boolean isBalanced(TreeNode root) {
        depth(root);
        return balanced;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftD = depth(root.left);
        int rightD = depth(root.right);

        if (Math.abs(leftD - rightD) > 1) {
            balanced = false;
        }
        return Math.max(leftD, rightD) + 1;
    }
}
