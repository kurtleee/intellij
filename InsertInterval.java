/*Created by @Kurt LEE On 1/26/23 4:05 PM.*/
import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {

    }
    public int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        int i = 0;
        // 将右边界比目标的左边界小的先加入res
        while (i  < intervals.length && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        res.add(newInterval);

        while (i < intervals.length) {
            res.add(intervals[i++]);
        }

        return res.toArray(new int[res.size()][]);
    }
}
