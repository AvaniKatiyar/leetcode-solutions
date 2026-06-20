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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int flag=0;
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){return result;}
        queue.add(root);

        while(!queue.isEmpty())
        {
          int size=queue.size();
          List <Integer> sub=new ArrayList<>();
          for(int i=0;i<size;i++)
          {
           if(queue.peek().left!=null)
           {queue.add(queue.peek().left);}  
           if(queue.peek().right!=null)
           {queue.add(queue.peek().right); }
            
           sub.add(queue.poll().val);
          }
          if(flag==0)
          {
            result.add(sub);
            flag=1;
          }
          else
          {
            Collections.reverse(sub);
            result.add(sub);
            flag=0;
          }
          
        }
       return result;
    }
}
