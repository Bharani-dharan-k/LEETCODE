import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hp = new HashMap<>();
        for (char c : s.toCharArray()) {
            hp.put(c, hp.getOrDefault(c, 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        int n = hp.size();
        while (n-- > 0) {
            int max = 0;
            char ch = 0;
            for (Map.Entry<Character, Integer> e : hp.entrySet()) {
                if (e.getValue() > max) {
                    max = e.getValue();
                    ch = e.getKey();
                }
            }
            for (int i = 0; i < max; i++) {
                res.append(ch);
            }
            hp.remove(ch);
        }
        return res.toString();
    }
}
