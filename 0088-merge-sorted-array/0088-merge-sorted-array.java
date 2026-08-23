class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i=m-1; // nums 1 pointer
      int j= n-1; // nums2 pointer 
      int k= nums1.length-1;
      while(j>=0 && i>=0)
      {
        if(nums2[j] > nums1[i])
        {
            nums1[k]=nums2[j];
            j--;
        }
        else if( nums1[i]>=nums2[j])
        {
            nums1[k]=nums1[i];
           
           i--;
        }
        k--;
      } 

     while (j >= 0) 
     {
            nums1[k] = nums2[j];
            j--;
            k--;
     }

    }
}