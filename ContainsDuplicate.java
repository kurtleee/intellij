import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{5,1,3,7,4,8,1};
        ContainsDuplicate o1 = new ContainsDuplicate();
        System.out.print(o1.pro(arr));
        System.out.print(o1.naive(arr));
    }

    // Naive Approach but somehow good.
    public boolean naive(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // Useless but looks better.
    public boolean pro(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : arr) {
            if (mp.containsKey(num)) {
                return true;
            }
            mp.put(num, mp.getOrDefault(num, 0) + 1);

        }
        return false;
    }
}
