import java.util.ArrayList;
import java.util.List;

public class _127LadderLength {

    private static int result = Integer.MAX_VALUE;

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        List<String> visited = new ArrayList<>();
        dfs(beginWord, endWord, wordList, visited);
        return result == Integer.MAX_VALUE ? 0 : result + 1;
    }

    private static void dfs(String beginWord, String endWord, List<String> wordList, List<String> visited) {

        if (beginWord.equals(endWord)) {
            result = Math.min(visited.size(), result);
            return;
        } else if (visited.size() == wordList.size()) {
            return;
        }

        for (int i = 0; i < wordList.size(); i++) {
            String str = wordList.get(i);
            if (!containsI(visited, str) && oneCharDiff(beginWord, str)) {
                visited.add(str);
                dfs(wordList.get(i), endWord, wordList, visited);
                visited.remove(str);
            }
        }
    }

    private static boolean oneCharDiff(String beginWord, String s) {
        int diffCount = 0;
        for (int i = 0; i < beginWord.length(); i++) {
            if (!(beginWord.charAt(i) == s.charAt(i))) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }

    private static boolean containsI(List<String> visited, String index) {
        for (String integer : visited) {
            if (integer.equals(index)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1() {
        List<String> words = new ArrayList<>();
        words.add("hot");
        words.add("dot");
        words.add("dog");
        words.add("lot");
        words.add("log");
        System.out.println(ladderLength("hit", "cog", words));
    }
}
