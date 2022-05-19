# Interview 4

## Valid triangles Leetcode 611

```Java
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        if (nums.length < 3) return res;
        for(int i = 0; i < nums.length; i++){
            int left = 0, right = i - 1;
            while(left < right){
                if(nums[left] + nums[right] > nums[i]){
                    res += right - left;
                    right --;
                }else left++;
            }
        }
        return res;
        
    }
}
```

## Missing number in a series Leetcode 268

```Java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] res = new int[n + 1];
        for(int i = 0; i < n; i++){
            res[nums[i]] = 1;
        }
         for(int i = 0; i < n; i++){
            if(res[i] == 0) return i;
        }return n;
    }
}
```

## Kth Largest Element in array

```Java
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 小顶堆，堆顶是最小元素
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int e : nums) {
            // 每个元素都要过一遍二叉堆
            pq.offer(e);
            // 堆中元素多于 k 个时，删除堆顶元素
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // pq 中剩下的是 nums 中 k 个最大元素，
        // 堆顶是最小的那个，即第 k 个最大元素
        return pq.peek();
    }
}
```

Solved using Priority Queue

