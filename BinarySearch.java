public class BinarySearch {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        BinarySearch o1 = new BinarySearch();
        System.out.print(o1.binarySearch(arr, 0, arr.length - 1, 5));
    }

    int binarySearch(int[] arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

}
