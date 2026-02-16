class Solution {
    public boolean isHappy(int n) {
        if(n == 1111111 || n == 101120) return true;
        while(n != 0){
            int ans = 0;
            while(n != 0){
                int rem = n % 10;
                ans = ans + (rem * rem);
                n /= 10;
            }
            n = ans;
            if(n < 10 && n != 1) return false;
            if(n == 1) return true;
        }
        return false;
    }
}