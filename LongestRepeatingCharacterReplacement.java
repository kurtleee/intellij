public class LongestRepeatingCharacterReplacement {
    // Driver code.
    public static void main(String[] args){
        String st = "AAAA";
        int n = 1;
        LongestRepeatingCharacterReplacement o1 = new LongestRepeatingCharacterReplacement();
        System.out.print(o1.longestRepeatingCharacterAfterReplacement(st, n));
    }

    public int longestRepeatingCharacterAfterReplacement(String st, int n){
        String temp = "";
        int dis = 0;
        int maxLength = -1;
        for (char c : st.toCharArray()) {
            String current = String.valueOf(c);
            if(!temp.contains(current)) {
                dis++;
            }
            temp = temp + String.valueOf(current);  // Warning:(19, 27) Unnecessary 'String.valueOf()' call; Warning:(19, 25) String concatenation '+' in loop
            if (temp.length() - dis > n) {
                temp = temp.substring(1);
                dis--;
            }
            maxLength = Math.max(maxLength, temp.length());
        }
        return maxLength;
    }

    // 方法二
    /*Created by @Kurt LEE On 1/15/23 3:39 AM.*/
    public int findLength(String s, int k) {
        public int characterReplacement(String s, int k) {
            int[] count = new int[26];
            int maxCount = 0;
            int maxLength = 0;
            int left = 0;

            for (int right = 0; right < s.length() ; ++right) {
                count[s.charAt(right) - 'A'] += 1;
                maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

                while (right - left + 1 - maxCount > k) {
                    count[s.charAt(left) - 'A'] -= 1;
                    left++;
                }

                maxLength = Math.max(maxLength, right - left + 1);

            }

            return maxLength;
    }
}
