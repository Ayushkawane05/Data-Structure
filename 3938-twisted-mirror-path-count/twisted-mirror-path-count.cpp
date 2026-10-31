class Solution {
public:
    int uniquePaths(vector<vector<int>>& grid) {
        const int mod = 1e9 + 7;
        vector<int> down(grid[0].size());  
        down[0] = 1;
        for (auto& row : grid) {
            int right = 0; 
            for (int j = 0; j < row.size(); j++) {
                if (row[j]) { 
                    swap(right, down[j]);
                } else {  
                    right = down[j] = (right + down[j]) % mod;
                }
            }
        }
        return down.back();
    }
};