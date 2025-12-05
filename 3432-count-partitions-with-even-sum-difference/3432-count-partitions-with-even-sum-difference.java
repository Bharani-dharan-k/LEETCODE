class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for(int x : nums){
            total += x;
        }
        return total % 2 == 0 ? nums.length - 1 : 0;
    }
}