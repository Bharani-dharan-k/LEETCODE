class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i); 
            if (c >= 65 && c <= 90) {
                capitalCount++;
            }
        }
        if (capitalCount == word.length()) return true;
        if (capitalCount == 0) return true;
        if (capitalCount == 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90) return true;

        return false;
    }
}