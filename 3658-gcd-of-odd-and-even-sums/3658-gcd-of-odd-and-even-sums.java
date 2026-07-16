class Solution {
    /*int GCD(int a,int b)
    {
            if(b==0) return a;
            return GCD(b,a%b);
    }*/
    public int gcdOfOddEvenSums(int n) {
        //return GCD((n*n),(n*n)+n);
        int a=n*n;
        int b=n*n+n;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}