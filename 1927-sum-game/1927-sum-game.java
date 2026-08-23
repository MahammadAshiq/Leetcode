class Solution {
    public boolean sumGame(String num) {
        char ch[] = num.toCharArray();
        int l=0,s1=0,s2=0,q1=0,q2=0;
        for(char c : ch)
        {
            if(c=='?')
            {
                if(l<num.length()/2) q1++;
                else q2++;
            }
            else
            {
                if(l<num.length()/2) s1+=c-'0';
                else s2+=c-'0';
            }
            l++;
        }
        int d=s1-s2;
        int q=q1-q2;
        if(q==0) return d!=0;
        if(q%2!=0) return true;
        return d+(q/2)*9!=0;
    }
}