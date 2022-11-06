import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        ProductOfArrayExceptSelf o1 = new ProductOfArrayExceptSelf();
        System.out.print(Arrays.toString(o1.naive(nums)));
    }

    // Naive approche;
    /* Time Complexity: O(N^2) since we used two for loopsa int this function.
    *  Space Complexity: O(N) where N is the length of the original array.
    * */
    public int[] naive(int[] nums) {
        int[] ans = new int[nums.length];
        ans = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length ; ++i) {
            int current = 1;
            for (int j = 0; j < nums.length ; ++j ) {
                if (j == i) {
                    continue;
                }   else {
                    current = current * nums[j];
                }
            }
            ans[i] = current;
        }
        return ans;
    }


}
