import java.util.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        int index = 0;
        for (String s : words) {
            if (s.indexOf(x) != -1) {
                res.add(index);
            }
            index++;
        }
        return res;
    }
}
