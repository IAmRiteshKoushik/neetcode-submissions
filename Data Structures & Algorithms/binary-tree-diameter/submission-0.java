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
  int maxDiameter = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    depth(root);
    return maxDiameter;
  }

  // Keep finding depth and computing diameter at each stage
  private int depth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int l = depth(root.left);
    int r = depth(root.right);
    int dia = l + r;

    if (dia > maxDiameter) {
      maxDiameter = dia;
    }
    return Math.max(l, r) + 1;
  }

}
