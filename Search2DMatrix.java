import java.util.Arrays;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] m = new int[][]{{1,3,5}, {6,8,9}, {13,17,19}, {22,25,29}};
        int target = 9;
        Search2DMatrix o1 = new Search2DMatrix();
        System.out.print(Arrays.toString(o1.naiveSearch(m, target)));
        System.out.print(Arrays.toString(o1.binarySearch(m, target)));
    }

    //Time Complexity: O (N * M), where N is the number of rows and M is the number of columns.
    //Auxiliary Space: O(1)
    public int[] naiveSearch(int[][] m, int target) {
        for (int i = 0; i < m.length; ++i) {
            for (int j = i; j < m[i].length; ++j) {
                if (m[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }

    //The basic condition to apply Binary Search anywhere in any algorithm is that the search space should be sorted.
    //Time Complexity: O(N + M), where N is the number of rows and M is the number of columns.
    //Auxiliary Space: O(1)
    public int[] binarySearch(int[][] m, int target) {
        int row = 0, col = m[row].length - 1;
        while (row < m.length && col > 0) {
            if (m[row][col] == target) {
                return new int[] {row, col};
            }

            if (m[row][col] < target) {
                row++;
            } else {
                col--;
            }

        }
        return new int[]{-1, -1};
    }
}
