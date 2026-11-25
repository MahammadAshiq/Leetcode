class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> lm = new ArrayList<>(); 
        ArrayList<Integer> ln = new ArrayList<>(); 
        int[] array = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                lm.add(nums[i]);
            }
            else
            {
                ln.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
                array[i]=lm.get(i/2);
            else
                array[i]=ln.get(i/2);
        }
        return array;
    }
}