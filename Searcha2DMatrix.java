/*Created by @Kurt LEE On 2/25/23 9:02 PM.*/

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        Searcha2DMatrix o1 = new Searcha2DMatrix();
        if (o1.search(matrix, 3)) {
            System.out.println("Exist");
        } else {
            System.out.println("Not Exist! ");
        }
    }

    public boolean search(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midElement = matrix[mid / n][mid % n];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
