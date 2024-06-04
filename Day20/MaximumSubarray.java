//Question : https://leetcode.com/problems/maximum-subarray/description/

//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;

        int maxSum = Integer.MIN_VALUE;
        int maxEnding = 0;

        for(int i = 0; i < size ; i++){
            maxEnding = maxEnding + nums[i];

            if(maxSum < maxEnding){
                maxSum = maxEnding;
            }
            if(maxEnding < 0){
                maxEnding = 0;

            }
        }
        return maxSum;
        
    }
}