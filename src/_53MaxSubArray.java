public class _53MaxSubArray {

    public int maxSubArray(int[] nums) {

        int currentMaxValue = nums[0];
        int tempSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (tempSum < 0) {
                tempSum = nums[i];
            } else {
                tempSum += nums[i];
            }

            if (tempSum > currentMaxValue) currentMaxValue = tempSum;

        }

        return currentMaxValue;

    }

}
