class Solution {
    public int maxLength(int[] nums) {
        int ans = 2;
        int j = 0;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            while (gcd(product, a) > 1) {
                product = product / nums[j++];
            }
            product = product * a;
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }

    // public int gcd(int a, int b) {
    //     return b == 0 ? a : gcd(b, a % b);
    // }
    public int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}