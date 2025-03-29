package interview150;

import java.util.ArrayList;
import java.util.List;

public class _9IsPalindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        List<Integer> data = new ArrayList<>();
        while (x > 0) {
            data.add(x % 10);
            x = x / 10;
        }
        int start = 0;
        int end = data.size() -1;

        while (start < end) {
            int left = data.get(start);
            int right = data.get(end);
            if (left == right) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

}
