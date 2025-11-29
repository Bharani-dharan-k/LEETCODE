class Solution {
    public int minOperations(int[] nums, int k) {
        int res=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
        }
        res = count%k;
        return res;
    }
}