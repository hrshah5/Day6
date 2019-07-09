// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes, had to see the solution
// Any problem you faced while coding this : could think of any solution.

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum -k)){
                count += map.get(sum -k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;   
    }
}