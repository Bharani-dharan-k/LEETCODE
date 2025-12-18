class Solution {
    public long dfs(int[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0) return 0;
            long val=grid[r][c];
            grid[r][c]=0;
            return val+dfs(grid,r,c+1)+ dfs(grid,r,c-1)+dfs(grid,r+1,c)+dfs(grid,r-1,c);
    }
    public int countIslands(int[][] grid, int k) {
         long ans=0;
         int count=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]>=1){
                    ans=dfs(grid,r,c);
                    if(ans%k==0) count++;
                }
            }
        }return count;
    }
}