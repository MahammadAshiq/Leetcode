class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        String s=Integer.toBinaryString(n);
        int count=0;
        for(char c : s.toCharArray())
        {
            if(c=='1') count++;
        }
        return count==1;
    }
}