public class TrappingWater {
    public static void  main(String[] args) {
        TrappingWater o1 = new TrappingWater();
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length - 1;
        System.out.print(o1.bruteForceApproach(arr));
        System.out.print(o1.optimizedApproach(arr, n));
    }

//Approach 1 (Brute Approach): This approach is the brute approach. The idea is to:
//Traverse every array element and find the highest bars on the left and right sides.
// Take the smaller of two heights.
// The difference between the smaller height and the height of the current element
// is the amount of water that can be stored in this array element.
// Complexity Analysis:
// *********
//Time Complexity: O(N2). There are two nested loops traversing the array.
//Space Complexity: O(1). No extra space is required.
    public int bruteForceApproach(int[] arr) {
        int n = arr.length;
        int totalWater = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; ++i) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        for (int i = 0; i < n; ++i) {
            totalWater += Math.min(left[i], right[i]) - arr[i];
        }

        return totalWater;

    }


}
