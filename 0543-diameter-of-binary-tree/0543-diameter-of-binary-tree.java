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

    // global var
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        height(root);
        return diameter;
    }

    private int height(TreeNode node)
    {
      if(node==null)
      return 0;
      
      int lh=height(node.left);
      int rh=height(node.right);

      diameter = Math.max(diameter,lh+rh);
      return 1 + Math.max(lh,rh);

    }
}