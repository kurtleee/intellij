import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {
    public static void main(String[] args){
        String s = "jsaonbourne";
        String t = "jasonbourne";
        ValidAnagram o1  = new ValidAnagram();
        System.out.print(o1.isValid(s, t));
    }

    public boolean isValid(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length() ; ++i) {
            mp.put(t.charAt(i), mp.get(t.charAt(i)) - 1);
        }

        Set<Character> keys = mp.keySet();
        for (Character key : keys) {
            if (mp.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
