import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1002CommonChars {

    public List<String> commonChars(String[] A) {
        int[] minChar = new int[26];
        Arrays.fill(minChar, Integer.MAX_VALUE);
        for (String str : A) {

            int[] charCountStr = new int[26];
            for (int i = 0; i < str.length(); i++) {
                charCountStr[str.charAt(i)-'a']++;
            }
            for (int i =0;i<26;i++) {
                minChar[i] = Math.min(minChar[i],charCountStr[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minChar[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;

    }

}
