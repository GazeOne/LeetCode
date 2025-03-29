package interview150;

public class _560SubarraySum {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
            sum = 0;
        }

        return count;
    }

}
