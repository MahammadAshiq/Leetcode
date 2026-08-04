class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set <Integer> set = new HashSet<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i]) max=nums[i];
            if(min>nums[i]) min=nums[i];
            set.add(nums[i]);
        }
        List <Integer> list = new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}