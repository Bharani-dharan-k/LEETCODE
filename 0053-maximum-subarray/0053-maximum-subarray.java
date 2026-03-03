class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            currSum = (currSum + nums[i] > nums[i]) ? currSum + nums[i] : nums[i];
            maxSum = (currSum > maxSum) ? currSum : maxSum;
        }
        return maxSum;
    }
}