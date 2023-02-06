/*Created by @Kurt LEE On 2/7/23 2:28 AM.*/
public class MaxAreaOfIslands {
    public static void main(String[] args) {
        int[][] grid = new int[5][5];
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                grid[i][j] = 0;
            }
        }

        grid[3][3] = 1;

        MaxAreaOfIslands o1 = new MaxAreaOfIslands();
        System.out.println(o1.findIsland(grid));;

    }
    public int findIsland(int[][] grid) {
        if (grid.length == 0 || grid == null) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }

        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return 0;
        }

        int area = 0;
        grid[i][j] = 0;
        area += dfs(grid, i + 1, j);
        area +=dfs(grid,i - 1, j);
        area += dfs(grid,i, j + 1);
        area +=dfs(grid,i, j - 1);

        return area;
    }
}
