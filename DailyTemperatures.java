import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
/*Created by @Kurt LEE On: 11/14/22 3:16 PM.
* Created by @Kurt LEE On 11/14/22 3:17 PM.*/

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temps = new int[]{22,23,25,26,27};
        DailyTemperatures o1= new DailyTemperatures();
        System.out.print(Arrays.toString(o1.getTemp(temps)));
        System.out.print(Arrays.toString(o1.getTempPro(temps)));
    }


    // Naive approach.
    /*Time Complexity: O(N^2);
    * Space Complexity: O(N) where N is the length of the tmep arr.*/
    public int[] getTemp(int[] temps) {
        int[] ans = new int[temps.length];
        for (int i = 0; i < temps.length; ++i) {
            for (int j = i; j < temps.length; ++j) {
                if (temps[j] > temps[i]) {
                    ans[i] = j - i;
                    break;
                } else {
                    ans[i] = 0;
                }
            }

        }
        return ans;
    }

    /*Updated approach:
    * Using *Stack*
    * Created by @Kurt LEE On 11/15/22 3:24 PM.*/

    /*Time complexity: O(N);
    * Space complexity: O(W);*/
    public int[] getTempPro(int[] temps) {
        int[] ans = new int[temps.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = temps.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && temps[i] >= temps[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = stack.peek() - i;
            }

            stack.push(i);
        }
        return ans;
    }
}
