
class Solution {

    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);

        return check(0, n, costs, dp);
    }

    public int check(int i, int n, int[] costs, int[] dp) {

        if (i == n)
            return 0;

        if (dp[i] != Integer.MAX_VALUE)
            return dp[i];

        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;
        int thr = Integer.MAX_VALUE;

        if (i + 1 <= n) {
            one = check(i + 1, n, costs, dp)
                    + costs[i] + 1;
        }

        if (i + 2 <= n) {
            two = check(i + 2, n, costs, dp)
                    + costs[i + 1] + 4;
        }

        if (i + 3 <= n) {
            thr = check(i + 3, n, costs, dp)
                    + costs[i + 2] + 9;
        }

        return dp[i] = Math.min(one, Math.min(two, thr));
    }
}
