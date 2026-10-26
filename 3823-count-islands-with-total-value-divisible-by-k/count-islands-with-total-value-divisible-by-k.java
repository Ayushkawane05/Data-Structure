class Solution {
    public int countIslands(int[][] nums, int k) {
        int ans = 0;
        int n = nums.length;
        int m = nums[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[i][j] > 0) {
                    long a = bfs(nums, i, j);
                    if (a % k == 0)
                        ans++;
                }
            }
        }
        return ans;
    }

    public long bfs(int[][] nums, int i, int j) {

        if (i < 0 || j < 0 || i >= nums.length || j >= nums[0].length || nums[i][j] ==0) {
            return 0;
        }
        long a = nums[i][j];
        nums[i][j] = 0;
        return a + bfs(nums, i + 1, j) + bfs(nums, i - 1, j) + bfs(nums, i, j - 1) + bfs(nums, i, j + 1);

    }
}