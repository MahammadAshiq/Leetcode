class Solution {
    public int maxProduct(int[] nums) {
        int Cmin=nums[0];
        int Cmax=nums[0];
        int max =nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int p=Cmax;
            Cmax=Math.max(nums[i],Math.max(nums[i]*p,nums[i]*Cmin));
            Cmin=Math.min(nums[i],Math.min(nums[i]*p,nums[i]*Cmin));
            max=Math.max(Cmax,max);
        }
        return max;
    }
}