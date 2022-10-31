public class LengthOfLastWord {
    public static void  main(String[] args) {
        String s = "  okok  ";
        LengthOfLastWord o1 = new LengthOfLastWord();
        System.out.print(o1.lastWordCount(s));

    }
    // 解决这题有两种方法。
    // 第一种，从头遍历，使用String.trim();去掉首尾的空格。
    // 第二种，从尾巴遍历，设置标记char_flag，这里的if / else 语句比较巧妙，可以学习。
    public int lastWordCount(String s ) {
        int len = 0;
        boolean char_flag = false;

        for (int i = s.length() - 1; i >= 0; --i) {
            if (Character.isLetter(s.charAt(i))) {
                char_flag = true;
                len++;
            } else {
                if (char_flag) {
                    return len;
                }
            }
        }
        return len;
    }
}