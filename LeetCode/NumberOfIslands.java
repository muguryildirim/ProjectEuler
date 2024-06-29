import java.util.*;

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j});
        grid[i][j] = '0'; // Mark as visited
        
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            for (int[] dir : directions) {
                int x = point[0] + dir[0];
                int y = point[1] + dir[1];

                if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == '1') {
                    queue.offer(new int[]{x, y});
                    grid[x][y] = '0'; // Mark as visited
                }
            }
        }
    }
}
