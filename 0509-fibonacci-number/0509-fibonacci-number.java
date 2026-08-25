class Solution {
    public int fib(int n) {
        int n1=0;
        int n2=1;
        int n3=0;
        if(n==0) return 0;
        else if(n==1 || n==2) return 1;
        else
        {
            n--;
            while(n!=0)
            {
                n3=n1+n2;
                n1=n2;
                n2=n3;
                n--;
            }       
        }
        return n3;
    }
}