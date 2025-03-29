package interview150;

import java.util.ArrayList;
import java.util.List;

public class _70ClimbStairs {

    public int climbStairs(int n) {

        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        int i = 2;
        while (i <= n) {
            arr[i] = arr[i - 1] + arr[i - 2];
            i++;
        }
        return arr[n];
    }

}
