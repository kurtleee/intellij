public class NumberOfIslands {

    public static void main(String[] args) {
    }

    public int isIsland(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int m =  grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; i < n; ++j) {
                dfs(grid, i, j);
                count++;
            }
        }

        return count;

    }

    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n || grid[0][0] == 0) {
            return ;
        }

        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
