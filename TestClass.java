import java.util.*;

public class TestClass {
    public static void main(String[] args) {

    }

    public int maxFrequency(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        List<Integer> sortedFreq = new ArrayList<>(freq.values());
        Collections.sort(sortedFreq, Collections.reverseOrder());

        for (int i = 0; i < sortedFreq.size(); i++) {
            int f = sortedFreq.get(i);
            int inc = (i + 1 < sortedFreq.size()) ? (freq.size() * (f - sortedFreq.get(i+1))) : k / f;
            if (inc > k) break;
            k -= inc;
            maxFreq = f + inc / freq.size();
        }

        return maxFreq;
    }
}