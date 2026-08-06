class Solution {
    public String reverseStr(String s, int k) {
        char[] ch =s.toCharArray();
        for(int i=0;i<ch.length;i+=2*k)
        {
            int l=i;
            int r=Math.min(i+k-1,ch.length-1);
            while(l<r)
            {
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}