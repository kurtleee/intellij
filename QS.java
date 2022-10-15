public class QS {
    public void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(nums, start, end);

            quickSort(nums, start, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, end);
        }
    }
    
    public int partition(int[] nums, int start, int end) {
        int i = start - 1;
        
        for (int j = 0; j < end; ++j) {
            if (nums[i] <= nums[j]) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        
        int temp = nums[i + 1];
        nums[i + 1] = nums[end];
        nums[end] = temp;
        i++;
        return i;
        /* For this line of code, we just interate throught the whole array to get what we want.
        This is not a test.
        */
    }

    public static void main(String[] args) {
    }
}
