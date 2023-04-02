// Created by @Kurt LEE. Last Modified on 4/2/23, 3:01 PM.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();


    }

    public List<List<Integer>> findSubSet(int[] nums, int index, List<Integer> subset, List<List<Integer>> res) {
        res.add(new ArrayList<>(subset));

        for (int i = index; i < nums.length; ++i) {
            subset.add(nums[i]);
            findSubSet(nums, index + 1, subset, res);
            subset.remove(subset.size() - 1);
        }
        return new ArrayList<>();
    }

}
