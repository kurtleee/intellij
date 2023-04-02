
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        TestClass o1 = new TestClass();
        System.out.println(o1.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; // keep track of used numbers
        backtrack(nums, used, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> cur, List<List<Integer>> res) {
        if (cur.size() == nums.length) { // found a permutation
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) { // try all unused numbers
            if (used[i]) {
                continue;
            }
            cur.add(nums[i]); // choose current number
            used[i] = true;
            backtrack(nums, used, cur, res); // recursive call
            cur.remove(cur.size() - 1); // undo the choice
            used[i] = false;
        }
    }

}


