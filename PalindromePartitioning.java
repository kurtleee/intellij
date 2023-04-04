/*Created by @Kurt LEE. Last Modified on 4/5/23, 12:54 AM.*/

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {

    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        // 预处理回文串
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0; j <= i; ++j) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                }
            }
        }
        // 回溯搜索所有合法的划分方案
        backtrack(s, 0, res, path, dp);
        return res;
    }

    private void backtrack(String s, int start, List<List<String>> res, List<String> path, boolean[][] dp) {
        if (start == s.length()) {
            // 当搜索到字符串末尾时，将当前路径加入到结果中
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < s.length(); ++i) {
            if (dp[start][i]) {
                // 当[start, i]是回文子串时，将其加入当前路径中
                path.add(s.substring(start, i + 1));
                // 继续深度搜索后续字符
                backtrack(s, i + 1, res, path, dp);
                // 回溯到上一个状态
                path.remove(path.size() - 1);
            }
        }
    }



}