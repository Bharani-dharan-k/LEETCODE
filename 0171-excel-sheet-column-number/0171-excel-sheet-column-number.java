class Solution {
    public int titleToNumber(String columnTitle) {
        char[] title=columnTitle.toCharArray();
        int number=0;
        for(char c : title)
        {
            number = number* 26 + (c - 'A' + 1);
        }
        return number;
    }
}