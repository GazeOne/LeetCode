public class _70ClimbStairs {

    public int climbStairs(int n) {

        if (n == 1) return 1;
        int result = 0;
        int result0 = 1;
        int result1 = 1;
        for (int i = 2; i <= n; i++) {
            result = result0 + result1;
            result0 = result1;
            result1 = result;
        }
        return result;
    }

}
