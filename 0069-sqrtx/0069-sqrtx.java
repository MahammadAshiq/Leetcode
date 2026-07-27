class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        long l= 1;
        long r =x/2;
        long mid;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(mid*mid==x) return (int)mid;
            else if(mid*mid > x) r=mid-1;
            else l=mid+1;
        }
        return (int)r;
    }
}