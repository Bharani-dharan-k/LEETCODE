class Solution {

    public char kthCharacter(long k, int[] operations) {

        int n = operations.length;
        long[] len = new long[n + 1];
        len[0] = 1;

        for (int i = 0; i < n; i++) {
            len[i + 1] = Math.min(len[i] * 2, k);
        }

        int shift = 0;

        for (int i = n - 1; i >= 0; i--) {

            if (k > len[i]) {

                k -= len[i];

                if (operations[i] == 1) {
                    shift++;
                }
            }
        }

        return (char) ('a' + (shift % 26));
    }
}