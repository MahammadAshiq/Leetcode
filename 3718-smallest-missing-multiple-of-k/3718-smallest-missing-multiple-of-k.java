class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ele=k;
        while(true)
        {
            boolean found=false;
            for(int i:nums)
            {
                if(ele==i)
                {
                    found=true;
                    break;
                }
            }
            if(!found) return ele;
            ele=ele+k;
        }
    }
}