class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int height =triangle.size();//size = 4
        if(height==1) return triangle.get(0).get(0);
        int dp[][]=new int [height+1][height+1];//5X5 matrix

        //go to last level of triangle
        for(int level=height-1; level>=0; level--)
        {
            //fill each element if this level of dp array with min cost
            for(int i=0; i<=level; i++)
            {
                dp[level][i]=triangle.get(level).get(i)+
                                 Math.min(dp[level+1][i], dp[level+1][i+1]);
            } 
        }
        return dp[0][0];
    }
}