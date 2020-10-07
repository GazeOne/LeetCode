public class _55CanJump {

    private static boolean canJump = false;

        public static boolean canJump(int[] nums) {
            int n = nums.length;
            int rightmost = 0;
            for (int i = 0; i < n; ++i) {
                if (i <= rightmost) {
                    rightmost = Math.max(rightmost, i + nums[i]);
                    if (rightmost >= n - 1) {
                        return true;
                    }
                }
            }
            return false;
        }


    private static void dfs(int[] nums, int start, int end) {

        if (start <= end && nums[start] >= end - start) {
            canJump = true;
            return;
        }

        for (int i = 1; start <= end && i <= nums[start]; i++) {
            dfs(nums, start + i, end);
        }
    }

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1() {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }

    public static void testCase2() {
        int[] nums = {2, 0};
        System.out.println(canJump(nums));
    }
}
