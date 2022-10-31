import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
        int[] arr = new int[]{18,19,5,3,67,1};
        ReplaceElementswithGreatestElementonRightSide o1 = new ReplaceElementswithGreatestElementonRightSide();
        System.out.print(Arrays.toString(o1.app(arr)));
    }

    public int[] app(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        for (int i = 0; i < arr.length ; ++i) {
            int max = 0;
            for (int j = i; j < arr.length ; ++j) {
                max = Math.max(max, arr[j]);
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;


    }
}
