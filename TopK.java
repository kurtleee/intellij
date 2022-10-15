import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopK {
    public void TopKElements (int[] arr, int k, int n) {
        // Create a HashMap mp to store the key & value pair.
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int num : arr) {
            mp.put(0, mp.getOrDefault(num, 0) + 1);
        }

        // Create a list based on the HashMap mp we just created.
        List<Map.Entry<Integer, Integer> > list = new ArrayList<>();

    }
}
