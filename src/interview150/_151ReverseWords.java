package interview150;

import java.util.List;

public class _151ReverseWords {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] ss = s.split(" ");

        for (int i = ss.length - 1; i >= 0; i--) {
            String temp = ss[i];
            if (!temp.isBlank()) {
                sb.append(temp);
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }

}
