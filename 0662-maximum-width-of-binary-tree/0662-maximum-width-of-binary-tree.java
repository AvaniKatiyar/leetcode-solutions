class Pair {
    int index;
    TreeNode node;

    Pair(int index, TreeNode node){
        this.index = index;
        this.node = node;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if(root == null) return 0;

        int max = 0;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, root));

        while(!queue.isEmpty()) {

            int size = queue.size();
            int min = queue.peek().index;

            int first = 0;
            int last = 0;

            for(int i=0;i<size;i++) {

                int currIndex = queue.peek().index - min;
                TreeNode node = queue.peek().node;

                queue.poll();

                if(i == 0) first = currIndex;
                if(i == size-1) last = currIndex;

                if(node.left != null)
                    queue.offer(new Pair(2*currIndex + 1, node.left));

                if(node.right != null)
                    queue.offer(new Pair(2*currIndex + 2, node.right));
            }

            max = Math.max(max, last - first + 1);
        }

        return max;
    }
}