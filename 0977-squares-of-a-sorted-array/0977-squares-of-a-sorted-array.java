class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int res[]= new int [l];
        int i=0;
        int k=l-1; // for result array 
        int j = l-1;
        while(i<=j)
        {
            int left=nums[i]*nums[i];
            int right =nums[j]*nums[j];
            if(left>=right)
            {
              res[k--]=left;
              i++;

            }
            else {
                res[k--]=right ;
                j--;
            }
        }
        return res;
    }
}