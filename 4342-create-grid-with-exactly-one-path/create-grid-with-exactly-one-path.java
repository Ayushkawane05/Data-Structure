class Solution {
    public String[] createGrid(int m, int n) {
        char[][] ans = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == m - 1) {
                    ans[i][j] = '.';
                } else
                    ans[i][j] = '#';
            }
        }
        int j = 0;
        String[] st = new String[m];
        for (char[] ch : ans) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < ch.length; i++) {
                s.append(ch[i]);
            }
            st[j++] = s.toString();
        }
        return st;
    }
}