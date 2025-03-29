package interview150;

public class _209MinSubArrayLen {

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minCount = Integer.MAX_VALUE;
        int start = 0;
        int aCount = 0;
        int tempCount = 0;
        int j;

        while (start < n) {
            for (j = start; j < n; j++) {
                aCount += nums[j];
                tempCount++;
                if (aCount >= target) {
                    minCount = Math.min(minCount, tempCount);
                    tempCount = 0;
                    aCount = 0;
                    break;
                }
            }
            if (j >= n) break;
            start++;
        }
        if (minCount != Integer.MAX_VALUE)
            return minCount;
        else return 0;
    }

    public static void main(String[] args) {
        int[] a = new int[] {2,3,1,2,4,3};
        minSubArrayLen(7, a);
    }
}
