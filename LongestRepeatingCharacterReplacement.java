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
}
