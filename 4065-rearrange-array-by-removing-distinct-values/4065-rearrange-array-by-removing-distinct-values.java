class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] count = new int[101];
        int[] ans = new int[n];
        int index = 0;
        for (int x : nums) {
            count[x]++;
        }
        while (index < n) {
            for (int x = 1; x <= 100; x++) {
                if (count[x] > 0) {
                    count[x]--;
                    ans[index++] = x;
                }
            }
        }
        return ans;
    }
}