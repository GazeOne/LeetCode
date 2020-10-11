
public class _416CanPartition {

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, nums[i]);
        }
        if (n > 1 && sum % 2 == 0 && maxSum <= sum / 2) {
            int target = sum / 2;
            //dp[i][j] 表示 nums[0...i] 中选择若干个能否组成和为j
            boolean[][] dp = new boolean[n][target + 1];
            //dp[i][0]为true，nums[0..i]中选择0个
            for (int i = 0; i< n; i++) {
                dp[i][0] = true;
            }
            dp[0][nums[0]] = true;
            for (int i = 1; i< n; i++) {
                int num = nums[i];
                for (int j = 1; j <= target; j++) {
                    if (j >= num) {
                        //nums[i]选或不选两种有一个为true即为true
                        dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            return dp[n-1][target];
        }
        return false;
    }


    public static void testCase1() {
        int[] nums = {1, 5, 11, 5};
        System.out.println(canPartition(nums));
    }

    public static void testCase2() {
        int[] nums = {1, 2, 5};
        System.out.println(canPartition(nums));
    }

    public static void main(String[] args) {
        testCase2();
    }

}
