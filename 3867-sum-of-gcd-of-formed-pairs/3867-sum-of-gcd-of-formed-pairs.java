class Solution {
    private int f_gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int i=0;
        int[] nums1 = new int[nums.length];
        int m = nums[0];
        while(i<nums.length)
        {
            m=Math.max(m,nums[i]);
            nums1[i] = f_gcd(nums[i],m);
            i++;
        }
        Arrays.sort(nums1);
        long s=0;
        int k1=0;
        int k2=nums1.length-1;
        while(k1<k2)
        {
            s+=f_gcd(nums1[k1],nums1[k2]);
            k1++;
            k2--;
        }
        return s;
    }
}