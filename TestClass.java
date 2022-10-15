
import java.util.*;

public class TestClass{
    public static void main(String[] args) {
       int[] arr = new int[]{1,2,3,4,5,6,7,8};
       TestClass o1 = new TestClass();
       o1.quickSort(arr, 0, arr.length - 1);

    }

    public void swap(int[] arr, int self, int target) {
        int temp = arr[self];
        arr[self] = arr[target];
        arr[target] = temp;
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int j = start - 1;
        for (int i = start; i < end; ++i) {
            if (arr[i] > pivot) {
                j++;
                swap(arr, i, j);
            }
        }
        swap(arr, j + 1, pivot);
        return (j + 1);
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }
}
