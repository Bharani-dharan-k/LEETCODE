class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(Character.toLowerCase(c));
            }
        }
        String result1 = result.toString();
        String reversed = result.reverse().toString();
        return result1.equals(reversed);
    }
}