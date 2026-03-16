class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        int fresh = 0;
        Queue<int[]> rotten = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0;i < m; i++){
            for(int j = 0;j < n; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                if(grid[i][j] == 2){
                    rotten.offer(new int[]{i, j});
                }
            }
        }
        int[][] dir = {
            {0,1},
            {0,-1},
            {1,0},
            {-1,0}
        };
        while(!rotten.isEmpty() && fresh > 0){
            int size = rotten.size();
            for(int i = 0;i < size; i++){
                int[] cur = rotten.poll();
                for(int[] d : dir){
                    int x = cur[0] + d[0];
                    int y = cur[1] + d[1];
                    if(x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 1){
                        grid[x][y] = 2;
                        fresh--;
                        rotten.offer(new int[]{x, y});
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}