class Solution {
    public boolean isSubIsland = true;
    public void dfs(int[][] grid1, int[][] grid2, int r, int c) {
        if(r < 0 || c < 0 || r >= grid2.length || c >= grid2[0].length || grid2[r][c] == 0) return;
        if(grid1[r][c] == 0) isSubIsland = false;
        grid2[r][c] = 0;
        dfs(grid1, grid2, r, c + 1);
        dfs(grid1, grid2, r, c - 1);
        dfs(grid1, grid2, r + 1, c);
        dfs(grid1, grid2, r - 1, c);
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int res = 0;
        for(int i = 0; i < grid2.length; i++) {
            for(int j = 0; j < grid2[0].length; j++) {
                if (grid2[i][j] == 1) {
                    isSubIsland = true;
                    dfs(grid1, grid2, i, j);
                    if (isSubIsland) res++;
                }
            }
        }
        return res;
    }
}