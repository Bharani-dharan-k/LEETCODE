class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max=0;
        int c=0;
        for(int n:nums) set.add(n);
        for(int n :nums)
        {
            int val = n;
            int i=1;
            while(set.contains(val))
            {
                set.remove(val);
                val++;
                c++;
            }
            while(set.contains(n-i))
            {
                set.remove(n-i);
                c++;
                i++;
            }

            max = Math.max(max,c);
            c=0;
        }
        return max;
    }
}