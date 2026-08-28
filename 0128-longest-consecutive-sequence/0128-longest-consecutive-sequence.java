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
            int j=0;
            while(set.contains(val+j))
            {
                set.remove(val+j);
                j++;
                c++;
            }
            while(set.contains(val-i))
            {
                set.remove(val-i);
                c++;
                i++;
            }

            max = Math.max(max,c);
            c=0;
        }
        return max;
    }
}