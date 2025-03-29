package interview150;

import java.util.HashSet;
import java.util.Set;

public class _202IsHappy {

    public static boolean isHappy(int n) {
        Set<Integer> sets = new HashSet<>();
        while (n != 1) {
            n = getNext(n);
            if (sets.contains(n)) {
                return false;
            }
            if (n == 1) return true;
            sets.add(n);
        }
        if (n == 1) return true;
        return false;
    }

    public static int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int a = n % 10;
            n = n / 10;
            sum += a * a;
        }
        return sum;
    }

    public static void main(String[] args) {
        isHappy(19);
    }

}
