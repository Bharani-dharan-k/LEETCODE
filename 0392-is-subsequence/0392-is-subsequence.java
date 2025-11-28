class Solution {
    public boolean isSubsequence(String s, String t) {
        int a =s.length();
        int b = t.length();
        int j = 0;
        for(int i = 0;i < b && j < a;i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
        }
        return j == a;
    }
}