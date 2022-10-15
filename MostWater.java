public class MostWater {
    public static void main(String args[]) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        MostWater o1 = new MostWater();
        // Test naive approach.
        System.out.print(o1.mostWater(arr));
    }

    // Naive approach.
    public int mostWater(int[] arr) {
        int max = 0;
        for (int i = 0;i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                max = Math.max(max, Math.min(arr[i], arr[j]) * (j - i));
            }
        }
        return max;
    }
}
