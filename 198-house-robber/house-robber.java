class Solution {
    public int rob(int[] nums) {

        int[] dp = new int[nums.length + 1];

        dp[0] = nums[0];

        if (nums.length == 1)
            return nums[0];

        if (nums.length == 2)
            return Math.max(nums[1], nums[0]);

        dp[1] = Math.max(nums[1], nums[0]);

        for (int i = 2; i < nums.length; i++) {
            int take = 0;

            take = dp[i - 2] + nums[i];

            int notTake = dp[i-1];

            dp[i] = Math.max(take, notTake);
        }

        return dp[nums.length - 1];

    }

}