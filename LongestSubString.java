
public class LongestSubString {
    public static void main(String[] args) {
        String st = "abba";
        LongestSubString o1 = new LongestSubString();

        System.out.print(o1.linearTimeSolution(st));
    }

    //Time Complexity: O(n^2) since we are traversing each window to remove all repetitions.
    //Auxiliary Space: O(1)
    public int longestSubStringWithoutRepeating(String st) {
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

    //Time Complexity: O(n) since we slide the window whenever we see any repetitions.
    //Auxiliary Space: O(1)
    int linearTimeSolution(String st) {
        if (st.isEmpty()) {
            return 0;
        } else if (st.length() == 1) {
            return 1;
        }

        int maxLength = -1;
        String temp = "";
        for (char c : st.toCharArray()) {
            String current = String.valueOf(c);
            if (temp.contains(current)) {
                temp = temp.substring(temp.indexOf(current) + 1);
            }
            temp = temp + current;
            maxLength = Math.max(maxLength, temp.length());
        }
        return maxLength;
    }

}
