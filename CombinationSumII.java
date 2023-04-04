//Created by @Kurt LEE. Last Modified on 4/5/23, 12:57 AM.

import java.awt.*;
import java.util.*;
import java.util.List;

public class CombinationSumII {


    public static void main(String[] args) {
        CombinationSumII o1 = new CombinationSumII();
        int[] candidates = {1,2,3,4,5,5};
        int target = 10;
        System.out.println(o1.combinationSum2(candidates, target));;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // sort the array to optimize backtracking
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> cur, List<List<Integer>> res) {
        if (target == 0) { // found a valid combination
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i-1]) { // skip duplicates
                continue;
            }
            int num = candidates[i];
            if (num > target) { // no need to try larger numbers
                break;
            }
            cur.add(num); // choose current number
            backtrack(candidates, target - num, i+1, cur, res); // recursive call with new start index
            cur.remove(cur.size() - 1); // undo the choice
        }
    }
}
