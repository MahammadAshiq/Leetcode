class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int res=-1;
        int m=nums.length/2;
        if(0!=m && nums.length-1!=m) res= nums[m];
        return res;
    }
}