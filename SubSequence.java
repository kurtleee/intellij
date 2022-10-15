import java.util.HashSet;

public class SubSequence {
    static int findLongestSubSequence(int[] arr, int n) {
        HashSet<Integer> S = new HashSet<Integer>();
        for (int num : arr) {
            S.add(num);
        }
        int ans = 0;

        for (int i = 0; i < n; ++i) {
            if (!S.contains(arr[i])) {
                int j = arr[i];
                while (S.contains(arr[j])) {
                    j++;
                }
                if (ans < j - arr[i]) {
                    ans = j - arr[i];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{};
        boolean isEmpty;
        System.out.print(findLongestSubSequence(arr, arr.length - 1));
    }
}
