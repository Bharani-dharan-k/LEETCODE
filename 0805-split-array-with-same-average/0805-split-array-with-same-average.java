class Solution
{
    public boolean splitArraySameAverage (int[] nums)
    {
        int totSum = 0;
        for (int num : nums)
        {
            totSum += num;
        }
        int len = nums.length;
        int[][] next = new int[len + 1][totSum + 1];
        for (int j=0;j<=len;j++)
        {
            for (int sum=0;sum<=totSum;sum++)
            {
                if (j > 0 && j < len)
                {
                    if (sum * (len - j) == (totSum - sum) * j)
                    {
                        next[j][sum] = 1;
                    }
                }
            }
        }
        for (int ind=len-1;ind>=0;ind--)
        {
            int[][] curr = new int[len + 1][totSum + 1];
            for (int count=len-1;count>=0;count--)
            {
                for (int sum=totSum-nums[ind];sum>=0;sum--)
                {
                    curr[count][sum] = next[count][sum] | next[count + 1][sum + nums[ind]];
                }
            }
            for (int i=0;i<=len;i++)
            {
                for (int j=0;j<=totSum;j++)
                {
                    next[i][j] = curr[i][j];
                }
            }
        }
        return next[0][0] == 1;
    }
}