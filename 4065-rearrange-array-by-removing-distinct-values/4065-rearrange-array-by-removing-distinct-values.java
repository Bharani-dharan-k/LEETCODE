class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int[] count = new int[101];
        int[] ans = new int[n];
        int index = 0;

        // Count occurrences
        for (int x : nums) {
            count[x]++;
        }

        // Repeat until all elements are removed
        while (index < n) {

            // Find distinct values in ascending order
            for (int x = 1; x <= 100; x++) {

                if (count[x] > 0) {

                    // Remove one occurrence
                    count[x]--;

                    // Add it to answer
                    ans[index++] = x;
                }
            }
        }

        return ans;
    }
}