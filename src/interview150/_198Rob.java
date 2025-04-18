package interview150;

public class _198Rob {

    public int rob(int[] nums) {

        if (nums.length <= 0) return 0;
        if (nums.length == 1) return nums[0];
        else if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] f = new int[nums.length];
        f[0] = nums[0];
        f[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            f[i] = Math.max(f[i - 1], f[i - 2] + nums[i]);
        }
        return Math.max(f[nums.length - 1], f[nums.length - 2]);
    }

}
