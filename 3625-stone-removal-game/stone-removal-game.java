class Solution {
    public boolean canAliceWin(int n) {
        int sub = 10;
        boolean ans = false;
        while (n >= sub) {
            n = n - sub;
            sub--;
            ans = !ans;
        }
        return ans;

    }
}