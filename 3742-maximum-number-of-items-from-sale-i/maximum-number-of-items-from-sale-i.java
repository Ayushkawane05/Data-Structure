class Solution {

    int[][] memo;
    int[] mult;

    public int maximumSaleItems(int[][] items, int budget) {

        mult = new int[1501];

        for (int[] it : items) {

            int fac = it[0];

            for (int f = 1; f <= 1500; f++) {
                if (fac % f == 0) {
                    mult[f]++;
                }
            }
        }

        int n = items.length;

        memo = new int[n][budget + 1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return solve(items, 0, budget);
    }

    public int solve(int[][] items, int i, int budget) {

        if (i == items.length) {
            return 0;
        }

        if (memo[i][budget] != -1) {
            return memo[i][budget];
        }

        int f = items[i][0];
        int p = items[i][1];

        int skip = solve(items, i + 1, budget);

        int take = 0;

        if (budget >= p) {

            int first = mult[f] +
                    solve(items, i + 1, budget - p);

            int more = 1 +
                    solve(items, i, budget - p);

            take = Math.max(first, more);
        }

        return memo[i][budget] = Math.max(skip, take);
    }
}
