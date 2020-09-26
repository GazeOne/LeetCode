import java.util.*;

public class _49GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> sortData = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String result = sort(strs[i]);
            if (sortData.containsKey(result)) {
                sortData.get(result).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                sortData.put(result, temp);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : sortData.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }

    private String sort(String str) {
        char[] chs = str.toCharArray();

        Arrays.sort(chs);

        return new String(chs);
    }

}
