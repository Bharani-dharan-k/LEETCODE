class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int n = pref.length();
        for(String word : words){
            if(word.length() >= n && word.startsWith(pref))
                count++;
        }
        return count;
    }
}