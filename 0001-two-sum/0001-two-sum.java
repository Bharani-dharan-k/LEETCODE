class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hp = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            int complement = target - nums[i];
            if(hp.containsKey(complement)){
                return new int[]{hp.get(complement),i};
            }
            hp.put(nums[i],i);
        }
        return null;
    }
}