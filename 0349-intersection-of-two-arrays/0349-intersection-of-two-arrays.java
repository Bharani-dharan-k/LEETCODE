class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        Set<Integer> rs = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int x : nums1){
            s.add(x);
        }
        for(int x : nums2){
            rs.add(x);
        }
        int[] nums3 = rs.stream().mapToInt(Integer::intValue).toArray();
        for(int x : nums3){

            if(!s.add(x)) res.add(x);
        }
        int[] intArray = res.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }
}