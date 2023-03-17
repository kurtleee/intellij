/*Created by @Kurt LEE On 3/18/23 3:14 AM.*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "abba";
        String s2 = "baab";

        IsomorphicStrings o1 = new IsomorphicStrings();
        System.out.println(o1.isIsomorphicStrings(s1, s2));
    }

    private boolean isIsomorphicStrings(String s1, String s2){

        // store the character pair;
        Map<Character, Character> mp = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }

        // store the character we've already visited;
        Set<Character> st = new HashSet<>();

        for (int i = 0; i <= s1.length() - 1; ++i) {
            Character c1 = s1.charAt(i);
            Character c2 = s2.charAt(i);


            if (mp.containsKey(c1)) {
                if (mp.get(c1) != c2) {
                    return false;
                }
            } else {
                if (st.contains(c2)) {
                    return false;
                }
            }

            mp.put(c1, c2);
            st.add(c2);
        }

        return true;
    }
}
