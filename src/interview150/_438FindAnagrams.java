package interview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _438FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if (n < m) return result;
        int start = 0;
        int[] subArr = new int[26];
        int[] pArr = new int[26];

        for (int i = 0; i < m; i++) {
            subArr[s.charAt(i) - 'a']++;
            pArr[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(subArr, pArr)) {
            result.add(start);
        }
        start++;

        while (start <= n - m) {
            subArr[s.charAt(start - 1) - 'a']--;
            subArr[s.charAt(start + m - 1) - 'a']++;
            if (Arrays.equals(subArr, pArr)) {
                result.add(start);
            }
            start++;
        }

        return result;
    }

}
