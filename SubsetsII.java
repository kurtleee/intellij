import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums); // sort the array to optimize backtracking
            List<List<Integer>> res = new ArrayList<>();
            backtrack(nums, 0, new ArrayList<>(), res);
            return res;
        }

        private void backtrack(int[] nums, int start, List<Integer> cur, List<List<Integer>> res) {
            res.add(new ArrayList<>(cur)); // add current subset to result
            for (int i = start; i < nums.length; i++) { // try all candidates
                if (i > start && nums[i] == nums[i-1]) { // skip duplicates
                    continue;
                }
                cur.add(nums[i]); // choose current candidate
                backtrack(nums, i+1, cur, res); // recursive call with new start index
                cur.remove(cur.size() - 1); // undo the choice
            }
        }

}
