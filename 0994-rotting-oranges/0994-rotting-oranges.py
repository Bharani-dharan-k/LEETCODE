from collections import deque

class Solution(object):
    def orangesRotting(self, grid):
        fresh, time = 0, 0
        rotten = deque()
        Y = len(grid)
        X = len(grid[0])
        for i in range(Y):
            for j in range(X):
                if grid[i][j] == 1:
                    fresh += 1
                elif grid[i][j] == 2:
                    rotten.append((i, j))
        directions = [(0,1), (0,-1), (1,0), (-1,0)]
        while rotten and fresh > 0:
            for _ in range(len(rotten)):
                y, x = rotten.popleft()
                for dy, dx in directions:
                    ny, nx = y + dy, x + dx
                    if 0 <= ny < Y and 0 <= nx < X and grid[ny][nx] == 1:
                        grid[ny][nx] = 2
                        fresh -= 1
                        rotten.append((ny, nx))
            time += 1
        return time if fresh == 0 else -1