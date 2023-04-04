/*Created by @Kurt LEE. Last Modified on 4/5/23, 12:57 AM.*/

public class WordSearch {
    public static void main(String[] args) {
        String target = "abcced";

    }

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;  // invalid input
        }
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n]; // to avoid using the same cell twice
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false; // word not found
    }

    private boolean dfs(char[][] board, String word, int row, int col, int index, boolean[][] visited) {
        if (index == word.length()) { // found the complete word
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length ||
                board[row][col] != word.charAt(index) || visited[row][col]) {
            return false; // invalid cell or character or already visited
        }
        visited[row][col] = true; // mark current cell as visited
        boolean res = dfs(board, word, row+1, col, index+1, visited) ||
                dfs(board, word, row-1, col, index+1, visited) ||
                dfs(board, word, row, col+1, index+1, visited) ||
                dfs(board, word, row, col-1, index+1, visited); // search in 4 directions
        visited[row][col] = false; // undo the mark to allow other paths
        return res;
    }
}
