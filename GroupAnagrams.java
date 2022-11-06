import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] s = {"abc", "bac", "cab"};
        GroupAnagrams o1 = new GroupAnagrams();
        System.out.print(o1.findAnagrams(s));
    }

    public List<List<String>> findAnagrams (String[] s) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String >> mp = new HashMap<>();
        for (String value : s) {
            char[] str = value.toCharArray();
            Arrays.sort(str);
            String current = String.valueOf(str);

            if (mp.get(current) != null) {
                List<String> a = mp.get(current);
                a.add(value);
                mp.put(current, a);
            } else {
                List<String> a = new ArrayList<>();
                mp.put(current, a);
            }

            for (Map.Entry<String, List<String>> en : mp.entrySet()) {
                res.add(en.getValue());
            }

        }

        return res;
    }


}
