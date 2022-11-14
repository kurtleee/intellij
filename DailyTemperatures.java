import java.util.Arrays;
/*Created by @Kurt LEE.
Updated On: 11/14/22
*/
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temp = new int[]{22,23,25,26,27};
        DailyTemperatures o1= new DailyTemperatures();
        System.out.print(Arrays.toString(o1.getTemp(temp)));
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
}
