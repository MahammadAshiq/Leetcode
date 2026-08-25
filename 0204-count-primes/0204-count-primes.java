class Solution {
    public int countPrimes(int n) {
        boolean[] isprime = new boolean[n];
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(!isprime[i])
            {
                c++;
                for(int j=i*2;j<n;j=j+i)
                {
                    isprime[j]=true;
                }
            }
        }
        return c;
    }
}