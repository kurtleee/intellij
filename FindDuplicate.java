/*Created by @Kurt LEE On 2/6/23 2:07 AM.*/


public class FindDuplicate {
    // This approach uses Floyd's Turtules and hare algorithm to find out whether there's a loop inside an array.
    public int findDuplicate (int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
