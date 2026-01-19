class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int start = nums.length - k;
        int[] res = new int[nums.length];
        int index = 0;
        for(int i = start;i< nums.length; i++){
            res[index++] = nums[i];
        }
        for(int i = 0;i < start;i++){
            res[index++] = nums[i];
        }
        for(int i = 0;i < nums.length;i++){
            nums[i] = res[i];
        }
    }
}