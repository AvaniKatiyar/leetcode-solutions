class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int l=nums.length;
        int res[]=new int [2];
        for(int i=0;i<l;i++)
        {
            int find= target-nums[i];
            if( map.containsKey(find) )
            {
                res[1]=map.get(find);
                res[0]=i;
                break;
            }
            map.put(nums[i],i);
        }
        
        return res;
    }
}