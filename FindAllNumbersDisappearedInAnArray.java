import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        FindAllNumbersDisappearedInAnArray o1 = new FindAllNumbersDisappearedInAnArray();
        System.out.print(o1.findAbsent(nums));
    }

    public List<Integer> findAbsent(int[] nums) {
        HashMap<Integer, Boolean> num_flag = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= 9; ++i) {
            num_flag.put(i, false);
        }

        for (int num : nums) {
            num_flag.put(num, true);
        }

        for (Map.Entry<Integer, Boolean> entry : num_flag.entrySet()) {
            if (!entry.getValue()) {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }


}
