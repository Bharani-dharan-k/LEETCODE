import java.util.*;
class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int time = 0;
        Queue<int[]> rotten = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    rotten.offer(new int[]{i, j});
                }
            }
        }
        int[][] directions = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0}
        };
        while (!rotten.isEmpty() && fresh > 0) {
            int size = rotten.size();
            for (int i = 0; i < size; i++) {
                int[] curr = rotten.poll();
                int r = curr[0];
                int c = curr[1];
                for (int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    if (nr >= 0 && nr < rows &&
                        nc >= 0 && nc < cols &&
                        grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        fresh--;
                        rotten.offer(new int[]{nr, nc});
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}