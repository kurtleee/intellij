import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,13,4,4,5,9};
        MajorityElement o1 = new MajorityElement();
        System.out.print(o1.majority(arr));
    }

    public int majority(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxIndex = 0;
        for (int j : arr) {
            mp.put(j, mp.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int current = entry.getValue();
            maxIndex = Math.max(current, maxIndex);
        }



        return getKeyByValue(mp, maxIndex);
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }


}
