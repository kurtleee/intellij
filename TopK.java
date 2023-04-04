import java.util.*;

public class TopK {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. 统计每个数字的出现频率
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // 2. 维护一个小根堆，保存当前出现频率最高的k个元素
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> freq.get(o1) - freq.get(o2));
        for (int num : freq.keySet()) {
            heap.offer(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // 3. 转换结果并返回
        int[] res = new int[k];
        int i = 0;
        for (int num : heap) {
            res[i++] = num;
        }
        return res;
    }
}
