class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] dup = nums.clone();
        int l=(nums.length-1)/2;
        int r=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0) nums[i]=dup[l--];
            else nums[i]=dup[r--];
        }
    }
}