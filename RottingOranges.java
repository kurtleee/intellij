/*Created by @Kurt LEE On 2/7/23 4:08 PM.*/
import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[] {r, c});
                } else if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int minutes = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                int r = point[0], c = point[1];
                for (int[] dir : dirs) {
                    int nr = r + dir[0], nc = c + dir[1];
                    if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        fresh--;
                        queue.offer(new int[] {nr, nc});
                    }
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}
