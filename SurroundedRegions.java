/*Created by @Kurt LEE On 2/7/23 3:15 AM.*/

public class SurroundedRegions {
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public void replaceSurroundedRegions(char[][] board) {
        if (board == null || board.length == 0) {
            return ;
        }

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; ++i) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }

            if (board[i][m - 1] == '0') {
                dfs(board, i, m - 1);
            }
        }

        for (int i = 0; i < n; ++i) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }

            if (board[m - 1][i] == '0') {
                dfs(board, m - 1, i);
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O') {
            return;
        }

        board[i][j] = '#';
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}
