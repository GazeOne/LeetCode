import java.util.*;

public class _17LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        Map<Character, List<Character>> map = new HashMap<>();
        map.put('1', Arrays.asList('!', '@', '#'));
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));

        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));

        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
        List<String> result = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {
            Character value = digits.charAt(i);
            List<Character> data = map.get(value);
            int length = data.size();
            completeResult(result, data, length);
        }

        return result;
    }

    private static void completeResult(List<String> result, List<Character> data, int length) {
        List<String> temp = new ArrayList<>(result);
        result.clear();
        for (int i = 0; i < length; i++) {
            if (temp.size() > 0) {
                for (int j = 0; j < temp.size(); j++) {
                    StringBuilder sb = new StringBuilder(temp.get(j));
                    sb.append(data.get(i));
                    result.add(sb.toString());
                }
            } else {
                result.add(String.valueOf(data.get(i)));
            }
        }
    }

    public static void main(String[] args) {
        String s = "23";
        List<String> result = letterCombinations(s);
        for (int i = 0;i <result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
