class Solution {
    public int findComplement(int num) {
        String n= Integer.toBinaryString(num);
        StringBuffer str= new StringBuffer();
        for(char i : n.toCharArray())
        {
            if(i=='1')
            {
                str.append('0');
            }
            else
            {
                str.append('1');
            }

        }
        return Integer.parseInt(str.toString(),2);
    }
}