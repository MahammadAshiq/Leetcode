class Solution {
    public int product(int x)
    {
        int res=1;
        while(x>0)
        {
            res=res*(x%10);
            x=x/10;
        }
        return res;
    }
    public int smallestNumber(int n, int t) {
        int a=n;
        while(true)
        {
            if(product(a)%t==0)
            {
                return a;
            }
            a=a+1;
        }
    }
}