class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int x : nums2) {
            if (map.containsKey(x) && map.get(x) > 0) {
                result.add(x);
                map.put(x, map.get(x) - 1); 
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
