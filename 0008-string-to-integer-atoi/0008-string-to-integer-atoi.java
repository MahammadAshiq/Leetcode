class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        long sum=0;
        int f=0;
        while(i<sb.length() && sb.charAt(i)==' ') i++;
        if(i==sb.length()) return 0;
        if(sb.charAt(i)=='+' || sb.charAt(i)=='-')
        {
            if(sb.charAt(i)=='-') f=1;
            i++;
        }
        while(i<sb.length())
        {
            if(!Character.isDigit(sb.charAt(i))) break;
            sum=sum*10+(sb.charAt(i)-'0');
            if(f==0 && sum>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(f==1 && -sum<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        if(f==1) sum=-sum;
        return (int)sum;
    }
}