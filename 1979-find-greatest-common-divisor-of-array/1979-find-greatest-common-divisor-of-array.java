class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i : nums)
        {
            if(i>max) max=i;
            if(i<min) min=i;
        }
        while(min!=0)
        {
            int temp = min;
            min = max%min;
            max=temp;
        }
        return max;

    }
}