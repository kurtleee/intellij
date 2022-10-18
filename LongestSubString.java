
public class LongestSubString {
    public static void main(String[] args) {
        String st = "abba";
        LongestSubString o1 = new LongestSubString();

        System.out.print(o1.longestSubStringWithoutReapting(st));
    }

    //Time Complexity: O(n^2) since we are traversing each window to remove all repetitions.
    //Auxiliary Space: O(1)
    public int longestSubStringWithoutReapting(String st) {
        int n = st.length();
        int res = 0;

        for (int i = 0; i < n; ++i) {
            boolean[] visited = new boolean[256];

            for (int j = i; j < n; ++j) {
                if (visited[st.charAt(j)]) {
                    break;
                } else {
                    res = Math.max(res, j - i + 1);
                    visited[st.charAt(j)] = true;
                }
            }
            visited[i] = false;
        }
        return res;
    }
}
