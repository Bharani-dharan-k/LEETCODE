class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> groupMapping = new HashMap<Integer, List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> currentGroup = groupMapping.getOrDefault(groupSizes[i], new ArrayList<Integer>());
            if (currentGroup.size() == groupSizes[i]) {
                result.add(currentGroup);
                currentGroup = new ArrayList<Integer>();
            }
            currentGroup.add(i);
            groupMapping.put(groupSizes[i], currentGroup);
        }
        for (int size : groupMapping.keySet()) {
            result.add(groupMapping.get(size));
        }
        return result;
    }
}