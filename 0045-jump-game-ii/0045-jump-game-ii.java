class Solution {
    public int jump(int[] nums) {
        int current=0;
        int max=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            max=Math.max(max,nums[i]+i);
            if(i==current)
            {
                c++;
                current=max;
                if(current>=nums.length-1) break;
            }
        }
        return c;
    }
}