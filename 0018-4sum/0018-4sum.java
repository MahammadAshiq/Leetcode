class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                int p=j+1;
                int q=nums.length-1;
                while(p<q)
                {
                    sum=(long) nums[i]+nums[j]+nums[p]+nums[q];
                    if(sum==target)
                    {
                        set.add(Arrays.asList(nums[i],nums[j],nums[p],nums[q]));
                        p++;
                        q--;
                    }
                    else if(sum<target) p++;
                    else q--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}