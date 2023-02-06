import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    static class Solution {
        private static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        public List<List<Integer>> pacificAtlantic(int[][] heights) {
            int m = heights.length;
            int n = heights[0].length;
            boolean[][] pacific = new boolean[m][n];
            boolean[][] atlantic = new boolean[m][n];
            List<List<Integer>> result = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                dfs(heights, pacific, i, 0, Integer.MIN_VALUE);
                dfs(heights, atlantic, i, n - 1, Integer.MIN_VALUE);
            }
            for (int j = 0; j < n; j++) {
                dfs(heights, pacific, 0, j, Integer.MIN_VALUE);
                dfs(heights, atlantic, m - 1, j, Integer.MIN_VALUE);
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (pacific[i][j] && atlantic[i][j]) {
                        List<Integer> coord = new ArrayList<>();
                        coord.add(i);
                        coord.add(j);
                        result.add(coord);
                    }
                }
            }

            return result;
        }

        private void dfs(int[][] heights, boolean[][] ocean, int i, int j, int prevHeight) {
            int m = heights.length;
            int n = heights[0].length;
            if (i < 0 || i >= m || j < 0 || j >= n) {
                return;
            }
            if (ocean[i][j] || heights[i][j] < prevHeight) {
                return;
            }
            ocean[i][j] = true;
            for (int[] dir : dirs) {
                int x = i + dir[0];
                int y = j + dir[1];
                dfs(heights, ocean, x, y, heights[i][j]);
            }
        }
    }

}
