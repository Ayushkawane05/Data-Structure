class Solution {
    public int minMergedInteger(int[] nums) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i += 2) {

            StringBuilder st = new StringBuilder();

            st.append(nums[i]);
            st.append(nums[i + 1]);

            int temp = Integer.parseInt(st.toString());

            ans = Math.min(ans, temp);
        }

        return ans;
    }
}