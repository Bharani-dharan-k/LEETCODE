class Solution {
    public int reverse(int x) {
        boolean sign = true;
        if(x < 0) sign = false;
        long rev = 0;
        x = Math.abs(x);
        while(x != 0){
            rev = (rev * 10) + (x % 10);
            x = x / 10;
            if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
                return 0;
        }
        if(!sign) return -1 *(int)rev;
        return (int)rev;
    }
}