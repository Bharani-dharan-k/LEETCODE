class Solution {
    public int smallestRepunitDivByK(int k) {
        // If k is divisible by 2 or 5, no number made of only '1' can divide it
        if (k % 2 == 0 || k % 5 == 0) return -1;
        int rem = 0;   
        for (int len = 1; len <= k; len++) {
            rem = (rem * 10 + 1) % k;  
            if (rem == 0) return len;  
        }
        return -1;  
    }
}
