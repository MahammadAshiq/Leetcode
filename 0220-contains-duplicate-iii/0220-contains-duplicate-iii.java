class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> ts = new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            long num=(long)nums[i];
            Long max=ts.ceiling(num);
            if(max!=null && max-num<=valueDiff) return true;
            Long min=ts.floor(num);
            if(min!=null && num-min<=valueDiff) return true;
            ts.add(num);
            if(i>=indexDiff) ts.remove((long)nums[i-indexDiff]);
        }
        return false;
    }
}