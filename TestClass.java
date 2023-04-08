
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0,9,0,9,99,0,99};
        TestClass o1 = new TestClass();
        System.out.println(o1.trap(nums));
    }



    public int trap(int[] height) {
        int n = height.length;

        int[] maxRight = new int[n];
        int[] maxLeft = new int[n];

        maxRight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        maxLeft[0] = height[0];
        for (int i = 1; i <= n - 1; ++i) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        int water = 0;
        for (int i = 0; i < n; ++i) {
            water += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return water;
    }

}


