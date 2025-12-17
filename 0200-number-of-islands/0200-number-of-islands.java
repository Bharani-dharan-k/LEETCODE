class Solution {
    public void dfs(char[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length) return;
        if(grid[r][c]=='1'){
            grid[r][c]='0';
            dfs(grid,r,c+1);
            dfs(grid,r,c-1);
            dfs(grid,r+1,c);
            dfs(grid,r-1,c);
        }
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]=='1'){
                    dfs(grid,r,c);
                    count++;
                }
            }
        }return count;
    }
}