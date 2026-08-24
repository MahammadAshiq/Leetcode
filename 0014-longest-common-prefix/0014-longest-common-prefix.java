class Solution {
    public String longestCommonPrefix(String[] strs) {
        int m=Integer.MAX_VALUE;
        int idx=-1;
        int j=0;
        for(String s : strs)
        {
            if(s.length()<m)
            {
                m=s.length();
                idx=j;
            }
            j++;
        }
        String s1 = strs[idx];
        for(int i=0;i<strs.length;i++)
        {
            if(i==idx) continue;
            while(!strs[i].startsWith(s1))
            {
                s1=s1.substring(0,s1.length()-1);
                if(s1.isEmpty()) return "";
            }
        }
        return s1;
    }
}