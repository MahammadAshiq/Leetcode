class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray())
        {
            freq[ch-'a']++;
        }
        StringBuilder sb1 = new StringBuilder();
        char m=0;
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<freq[i]/2;j++)
            {
                sb1.append((char)('a'+i));
            }
            if(freq[i]%2!=0)
            {
                m = (char)('a'+i);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb1);
        if(m!=0) sb2.append(m);
        sb2.append(new StringBuilder(sb1).reverse());
        return sb2.toString();
    }
}