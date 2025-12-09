class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for (int i : nums1)
        {
        set1.add(i);
        }
        for (int i : nums2)
        {
        set2.add(i);
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for (int num : set1){
            if (!set2.contains(num)){
                list1.add(num);
            }
        }
        for(int nums: set2){
            if(!set1.contains(nums)){
                list2.add(nums);
            }
        }
        return Arrays.asList(list1,list2);
    }
}