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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return levels;
        }
        queue.add(root);

        while(!queue.isEmpty())
    {
       List<Integer> sub=new ArrayList<>();
       int size=queue.size();
        for(int i=0;i<size;i++)
        {
            if(queue.peek().left!=null){
                queue.add(queue.peek().left);
            }
            if(queue.peek().right!=null)
            {
                queue.add(queue.peek().right);
            }
            sub.add(queue.poll().val);
        }
        levels.add(sub);
    }
        return levels;
    }
}