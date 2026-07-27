class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        // String s = Integer.toString(n);
        // int nums[] = new int[s.length()];
        // int sum=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     nums[i] = s.charAt(i)-'0';
        // }
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]!=0)
        //     {
        //         sum=sum+nums[i];
        //         sb.append(nums[i]);
        //     }
        // }
        // String s1 = sb.toString();
        // long new_num = Long.parseLong(s1);
        // return new_num*sum;
        int temp=n;
        int x = (int)Math.log10(n)+1;
        long arr[] = new long[x];
        int i=x-1;
        int s=0;
        while(temp>0)
        {   
            int rem=temp%10;
            if(rem!=0){
                s=s+rem;
                arr[i--]=rem;
            }
            temp=temp/10;
        }
        long res=0;
        if(i==-1) i=0;
        for(int j=i;j<arr.length;j++)
        {
            res=(res*10)+arr[j];
        }
        return res*s;
    }
}