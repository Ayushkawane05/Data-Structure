class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return check(nums, 0,dp);
    }

    public int check(int[] nums, int i,int[] dp) {
        if (i == nums.length - 1)
            return nums[i];
        if (i >= nums.length)
            return 0;

        if(dp[i]!=-1) return dp[i];

        int take = 0;
        if (i + 1 < nums.length)
            take = nums[i] + check(nums, i + 2,dp);

        int not = check(nums, i + 1,dp);

        return dp[i] = Math.max(take, not);
    }
}