class Solution {
    public int maxProduct(int[] nums) {
        int max1=0,max2=0;
        // int idx1=0,idx2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max1)
            {
                max2=max1;
                // idx2=idx1;
                max1=nums[i];
                // idx=i;
            }
            else if(nums[i]>max2)
            {
                max2=nums[i];
                // idx2=i;
            }
        }
        return (max1-1)*(max2-1);
    }
}