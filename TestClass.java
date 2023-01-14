public class TestClass {
    public static void main(String[] args) {
        String s = "ABBSBSBSDFSDF";

        int[] count = new int[26];

        for (int i = 0; i < s.length(); ++i) {
            count[s.charAt(i) - 'A'] += 1;
        }

        for (int k : count) {
            System.out.printf(String.valueOf(k));
        }
    }


}


