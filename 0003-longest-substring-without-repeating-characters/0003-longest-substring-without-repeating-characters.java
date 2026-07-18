class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map <Character,Integer> hm = new HashMap<>();
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++)
        {
            char c = s.charAt(r);
            if(hm.containsKey(c) && l<=hm.get(c))
            l=hm.get(c)+1;
            hm.put(c,r);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}