class Solution {
    public int maxArea(int[] height) {
        int max=0;
        // for(int i=0;i<height.length-1;i++)
        // {
        //     for(int j=height.length-1;j>i;j--)
        //     {
        //         int min = Math.min(height[i],height[j]);
        //         if((j-i)*min>max)
        //         {
        //             max=(j-i)*min;
        //         }
        //     }
        // }
        // return max;
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
            int min =  Math.min(height[i],height[j]);
            if(min*(j-i)>max) max = min*(j-i);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return max;
    }
}