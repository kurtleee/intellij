import java.util.Arrays;

/*Created by @Kurt LEE On 1/4/23 9:22 AM.*/
/*Your input is an array of integers, and you have t oreorder its evetires so that the even entries appear first.
* You cannot allocate additional space for this question, which means you have to do it inplace.*/
public class ReorderArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,9,3,2,4,10,12,15,18};
        ReorderArray o1 = new ReorderArray();
        o1.reorder(array);
        System.out.printf(Arrays.toString(array));
    }

    public void reorder(int[] array) {
        int nextEven = 0, nextOdd = array.length - 1;
        while (nextEven < nextOdd) {
            if (array[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = array[nextEven];
                array[nextEven] = array[nextOdd];
                array[nextOdd--] = temp;
            }
        }
    }
}


