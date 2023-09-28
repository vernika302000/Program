class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] res=new int[2];
        int i=0;
        int j=nums.length-1;
        while(i<j)
        {
            int sum=nums[i]+nums[j];
            if(sum==target)
            {
                res[0]=i;
                res[1]=j;
            }
            else if(sum<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return res;
    }
}
