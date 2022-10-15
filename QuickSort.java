import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuickSort {
    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,4,5,6,2,15,167,7,16,27,25,87,26};
        QuickSort B1 = new QuickSort();

        B1.quickSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("*************");
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
