public class Solution {
    public int reverseBits(int n) {
        String bin = Integer.toBinaryString(n);
        while (bin.length() < 32) {
            bin = "0" + bin;
        }
        String rev = new StringBuilder(bin).reverse().toString();
        return (int) Long.parseLong(rev, 2);
    }
}
