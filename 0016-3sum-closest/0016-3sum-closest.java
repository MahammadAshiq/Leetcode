class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int close=nums[0]+nums[1]+nums[2];
        for(int k=0;k<nums.length;k++)
        {
            int i=k+1;
            int j=nums.length-1;
            while(i<j)
            {
                sum=nums[k]+nums[i]+nums[j];
                if(Math.abs(close-target)>Math.abs(sum-target)) close=sum;
                if(sum<target) i++;
                else j--;
                
            }
        }
        return close;
    }
}