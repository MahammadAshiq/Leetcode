class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int i=3;
        while(i>=0)
        {
            arr[i--]=num%10;
            num=num/10;
        }
        Arrays.sort(arr);
        int x=arr[0]*10+arr[2];
        int y=arr[1]*10+arr[3];
        return x+y;
    }
}