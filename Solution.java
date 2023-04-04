class Solution1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Solution1 o1 = new Solution1();


    }
    public boolean exist(char[][] board, String word) {
        if (board == null || board[0].length == 0 || board.length == 0) {
            return false;
        }

        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[m][n] == word.charAt(0) && dfs(board, i, j, 0, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, int col, int row, int index, boolean[][] visited) {
        if (row < 0 || col < 0 || row > board.length || col > board[0].length || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;
        boolean res =
                dfs(board, col + 1, row, index + 1, visited) || dfs(board, col, row + 1, index + 1, visited) ||
                        dfs(board, col - 1, row, index + 1, visited) ||dfs(board, col, row - 1, index + 1, visited);

        visited[row][col] = false;

        return res;
    }


}