class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];   
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->b-a);
        for(int i : nums) maxheap.add(i);
        k--;
        while(k>0)
        {
            maxheap.poll();
            k--;
        }
        return maxheap.peek();
    }
}