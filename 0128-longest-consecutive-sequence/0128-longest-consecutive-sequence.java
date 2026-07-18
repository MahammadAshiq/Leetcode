class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int lc=0;
        for(int i : set)
        {
            if(!set.contains(i-1))
            {
                int curr = i;
                int c=1;
                while(set.contains(curr+1))
                {
                    curr++;
                    c++;
                }
                lc=Math.max(lc,c);
            }
        }
        return lc;
    }
}