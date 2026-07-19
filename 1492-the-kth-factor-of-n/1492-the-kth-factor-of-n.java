class Solution {
    public int kthFactor(int n, int k) {
        // List <Integer> list = new ArrayList<>();
        int found=-1;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(count==k-1)
                {
                    found=i;
                    break;
                }
                count++;
            }
        }
        return found;     
    }
}