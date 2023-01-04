import java.util.ArrayList;
import java.util.List;

public class IsPalindromeII {
    public static void main(String[] args) {
        String s = "aabbaa";
        IsPalindromeII o1 = new IsPalindromeII();
        System.out.print(o1.isPalindromeII(s));

    }

    /*This is a slow method that scan all the elements int str.
    * Time Complexity: O(N^2) where N is the length of the give string.
    * Asexuality Space:O(N);
    * 以上都是瞎写的。*/
    public boolean isPalindromeII(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str, int left ,int right)
    {
       while (left < right) {
           if (str.charAt(left) == str.charAt(right)) {
               left++;
               right--;
           } else {
               return false;
           }
       }
       return true;
    }

    public void test() {
        int[] arr = new int[]{1,2,3,5};
        String s = "asfdasdf1";
        List<Integer> list = new ArrayList<>(20);
        int n = arr.length;
        int m = s.length();
    }
}
