class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        int n=nums.length;
        int s1=n*(n+1)/2;
        for(int i=0;i<nums.length;i++) s=s+nums[i];
        return s1-s;
    }
}