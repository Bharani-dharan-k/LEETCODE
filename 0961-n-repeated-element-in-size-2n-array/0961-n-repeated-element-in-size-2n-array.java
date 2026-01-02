class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            hp.put(nums[i],hp.getOrDefault(nums[i],0) + 1);
        }
        for(int i = 0;i < nums.length; i++){
            if(n == (hp.get(nums[i])))
            return nums[i];
        }
        return -1;
    }
}