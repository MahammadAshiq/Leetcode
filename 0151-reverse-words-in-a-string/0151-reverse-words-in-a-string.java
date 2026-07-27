class Solution {
    public String reverseWords(String s) {
        // StringBuilder sb = new StringBuilder(s);
        String[] arr =s.trim().split("\\s+");
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            String s1=arr[i];
            arr[i++]=arr[j];
            arr[j--]=s1;
        }
        String res = String.join(" ",arr);
        return res;
    }
}