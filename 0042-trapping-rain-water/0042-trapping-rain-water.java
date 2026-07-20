class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int lmax=0;
        int rmax=0;
        int c=0;
        while(i<j)
        {
            if(height[i]<height[j])
            {
                if(height[i]>lmax)
                {
                    lmax=height[i];
                }
                else
                {
                    c=c+lmax-height[i];
                }
                i++;
            }
            else
            {
                if(height[j]>rmax)
                {
                    rmax=height[j];
                }
                else
                {
                    c=c+rmax-height[j];
                }
                j--;
            }
        }
        return c;
    }
}