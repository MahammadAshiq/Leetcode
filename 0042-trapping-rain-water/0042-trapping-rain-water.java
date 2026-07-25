class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax=0;
        int rmax=0;
        int c=0;
        while(l<r)
        {
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[r]);
            if(lmax<rmax)
            {
                c=c+lmax-height[l];
                l++;
            }
            else
            {
                c=c+rmax-height[r];
                r--;
            }
        }
        return c;
    }
}