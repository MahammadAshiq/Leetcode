class Solution {
    void Swap(int nums[],int l,int m)
    {
        int t=nums[l];
        nums[l]=nums[m];
        nums[m]=t;
    }
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h)
        {
            if(nums[m]==0)
            {
                Swap(nums,l,m);
                l++;
                m++;
            }
            else if(nums[m]==1) m++;
            else
            {
                Swap(nums,h,m);
                h--;
            }
        }
    }
}