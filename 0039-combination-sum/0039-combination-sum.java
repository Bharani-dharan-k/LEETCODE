import java.util.*;
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private void backtrack(int[] arr, List<Integer> curr, int idx, int target) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0 || idx == arr.length) return;
        curr.add(arr[idx]);
        backtrack(arr, curr, idx, target - arr[idx]);
        curr.remove(curr.size() - 1);
        backtrack(arr, curr, idx + 1, target);
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        backtrack(arr, new ArrayList<>(), 0, target);
        return ans;
    }
}