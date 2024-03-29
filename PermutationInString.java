import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Driver code;
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "aabb";
        String s2 = "aabbcc";
        PermutationInString o1 = new PermutationInString();
        System.out.println(o1.newSolutoin(s1, s2));

        System.out.println(o1.finalSolution(s1, s2));


    }

    /*Created by @Kurt LEE On 1/21/23 5:29 AM.*/

    public boolean finalSolution(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1_freq = new int[26];
        int[] win_freq = new int[26];

        for (int i = 0; i < s1.length(); ++i) {
            s1_freq[s1.charAt(i) - 'a']++;
            win_freq[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s2.length() - s1.length(); ++i) {
            if (Arrays.equals(s1_freq, win_freq)) {
                return true;
            }

            win_freq[s2.charAt(i)]--;

            if (i + s1.length() < s2.length()) {
                win_freq[s2.charAt(i + s1.length()) - 'a']++;
            }
        }

        return false;
    }


    // 我们使用一个array当作哈希表使用，追踪每个字母出现过的次数。
    // How to initialize:
    // int[] cnt1 = new int[26] -> 26 means there's 26 letters;
    //
    public boolean newSolutoin(String s1, String s2) {
        int s1Len = s1.length(), s2Len = s2.length();
        if (s1Len > s2Len) {
            return false;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < s1Len; ++i) {
            ++cnt1[s1.charAt(i) - 'a'];
            ++cnt2[s2.charAt(i) - 'a'];
        }
        if (Arrays.equals(cnt1, cnt2)) {
            return true;
        }
        for (int i = s1Len; i < s2Len; ++i) {
            ++cnt2[s2.charAt(i) - 'a'];
            --cnt2[s2.charAt(i - s1Len) - 'a'];
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
        }
        return false;

    }




    // Not gonna work. 不符合题目要求。子字符串必须按顺序排列。使用哈希表只能知道是否抵消，无法判断顺序。
    public boolean isPermutation(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> mp = new HashMap<>();
        // Put string s2 to the hashmap
        for (char c : s2.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : s1.toCharArray()) {
            if (!mp.containsKey(c)) {
                return false;
            }
            mp.put(c, mp.get(c) - 1);
            if (mp.get(c) < 0) {
                return false;
            }
            if (mp.containsValue(-1)) {
                return false;
            }
        }
        return true;
    }
}
