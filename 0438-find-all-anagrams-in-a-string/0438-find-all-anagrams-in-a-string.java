import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if (m > n) return ans;
        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']--;
            if (right - left + 1 > m) {
                count[s.charAt(left) - 'a']++;
                left++;
            }
            if (right - left + 1 == m) {
                boolean valid = true;
                for (int i = 0; i < 26; i++) {
                    if (count[i] != 0) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    ans.add(left);
                }
            }
        }
        return ans;
    }
}