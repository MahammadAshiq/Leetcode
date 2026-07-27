class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int i=0;
        int max=0;
        while(i<nums.length)
        {
            if(nums[i++]==1)
            {
                count++;
            }
            else
            {
                if(count>max)
                {
                    max=count;
                }
                count=0;
            }
        }
        if(max>count)
        {
            return max;
        }
        else
        {
            return count;
        }
    }
}