/*Created by @Kurt LEE On 11/17/22 1:21 AM.

* Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

*/

import javax.swing.*;
import java.util.Arrays;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int target = 10;
        SubarraySumEqualsK o1 = new SubarraySumEqualsK();

    }

    public int findSub(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = 1;
        int total = 0;
        while (left < right && right < arr.length - 1) {
            if (total < target) {

            }
        }
        return 0;
    }
}
