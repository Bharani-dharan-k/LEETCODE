class Solution {
    public int dfs(int[][] grid,int r,int c,int ans){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0) return 0;
            grid[r][c]=0;
            return 1+dfs(grid,r,c+1,ans)+ dfs(grid,r,c-1,ans)+dfs(grid,r+1,c,ans)+dfs(grid,r-1,c,ans);
    }
    public int maxAreaOfIsland(int[][] grid) {
         int ans=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    ans=Math.max(ans,dfs(grid,r,c,0));
                }
            }
        }return ans;
    }
}