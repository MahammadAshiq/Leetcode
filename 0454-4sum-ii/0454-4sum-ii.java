class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
       Map <Integer,Integer> hm = new HashMap<>();
       for(int i : nums1)
       {
            for(int j : nums2)
            {
                int sum = i + j;
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
       }
       int c = 0;
        for(int i : nums3)
        {
            for(int j : nums4){
                int sum = i + j;
                int target = -sum;
                if(hm.containsKey(target))
                {
                    c+=hm.get(target);
                }
            }
        }
        return c;
    }
}