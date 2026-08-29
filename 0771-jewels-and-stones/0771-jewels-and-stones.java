class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] arr = new boolean[128];
        for(char c : jewels.toCharArray())
        {
            arr[c]=true;
        }
        int count=0;
        for(char c : stones.toCharArray())
        {
            if(arr[c]) count++;
        }
        return count;
    }
}