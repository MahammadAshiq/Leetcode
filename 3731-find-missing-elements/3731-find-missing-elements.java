class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        List <Integer>list_new = new ArrayList<>();
        for(int i:nums) list_new.add(i);
        List <Integer> list = new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(!list_new.contains(i)) list.add(i);
        }
        return list;
    }
}