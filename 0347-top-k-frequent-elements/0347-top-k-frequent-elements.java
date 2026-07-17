class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        int[] arr = new int[k];
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue <Map.Entry<Integer,Integer>> maxheap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxheap.addAll(hm.entrySet());
        int j=0;
        while(k>0)
        {
            arr[j++]=maxheap.poll().getKey();
            k--;
        }
        return arr;
    }
}