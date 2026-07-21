class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // List<Integer> list = new ArrayList<>();
        // for(int i=0;i<nums.length-k+1;i++)
        // {
        //     int p=i;
        //     int q=i+k;
        //     int m=nums[p];
        //     while(p<q)
        //     {
        //         if(nums[p]>m) m=nums[p];
        //         p++;
        //     }
        //     list.add(m);
        // }
        // int[] arr = new int[list.size()];
        // for(int i=0;i<list.size();i++)
        //     arr[i]=list.get(i);
        // return arr;
        // ---------------
        // int max=nums[0];
        // for(int i=1;i<k;i++)
        // {
        //     if(max<nums[i]) max=nums[i];
        // }
        // List <Integer> list = new ArrayList<>();
        // list.add(max);
        // for(int i=k;i<nums.length;i++)
        // {
        //     if(nums[i]>max)
        //     {
        //         max=nums[i];
        //         list.add(max);
        //     }
        //     else
        //     {
        //         list.add(max);
        //     }
        // }
        // int[] arr = new int[list.size()];
        // for(int i=0;i<list.size();i++)
        // {
        //     arr[i]=list.get(i);
        // }
        // return arr;
        //--------
        Deque <Integer> dq = new ArrayDeque<>();
        int count =0;
        int[] result = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++)
        {
            while(!dq.isEmpty() && dq.peekFirst()<=i-k) dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]) dq.pollLast();
            dq.addLast(i);
            if(i>=k-1)
                result[i-k+1]=nums[dq.peekFirst()];
        }
        return result;
    }
}