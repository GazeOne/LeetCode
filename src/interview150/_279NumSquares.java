package interview150;

public class _279NumSquares {

    public static int numSquares(int n) {

        int min = Integer.MAX_VALUE;
        int[] dp = new int[n + 1]; //dp[i]表示和为i的最小平方数的数量， dp[i] = Math.min(dp[i-a^2]+1
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int index = i - j * j;
                if (index > 0) {
                    min = Math.min(min, dp[index] + 1);
                } else if (index == 0) {
                    dp[i] = 1;
                    break;
                } else {
                    break;
                }
                dp[i] = min;
            }
            min = Integer.MAX_VALUE;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        numSquares(12);
    }

}
