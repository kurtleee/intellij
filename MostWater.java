public class MostWater {
    public static void main(String args[]) {
        int[] arr = new int[]{6,1,5,9,2,4};
        MostWater o1 = new MostWater();
        // Test naive approach.
        System.out.print(o1.mostWater(arr));
        System.out.println("The optimized approach is: ");
        System.out.print(o1.optimizedMostWater(arr));
    }

    // Naive approach.
    // Complexity Analysis:
    // Time Complexity: O(n^2).
    //As nested traversal of the array is required, so time complexity is O(n^2)
    //Space Complexity: O(1).
    //As no extra space is required, so space complexity is constant.
    public int mostWater(int[] arr) {
        int max = 0;
        for (int i = 0;i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                max = Math.max(max, Math.min(arr[i], arr[j]) * (j - i));
            }
        }
        return max;
    }

    public int optimizedMostWater(int[] arr) {
        int left = 0, right = arr.length -  1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(arr[left], arr[right]) * (right - left));
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

}
