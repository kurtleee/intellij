import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        ProductOfArrayExceptSelf o1 = new ProductOfArrayExceptSelf();
        for (int i = 0; i < nums.length; ++i) {
            System.out.println(o1.optimized(nums)[i]);
        }
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


    public int[] optimized(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        suffix[n - 1] = 1;

        for (int i = 1; i < n; ++i) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for (int i = n - 2; i >= 0; --i) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; ++i) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
}
