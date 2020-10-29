public class _845LongestMountain {

    public static int longestMountain(int[] A) {
        int maxLength = 0;
        int n = A.length;
        int currentDir = -1; //-1 未开始， 0 表示up，1表示down
        int tempCount = 0;

        for (int i = 1; i < n; i++) {

            if (currentDir == -1) {
                if (A[i] > A[i - 1]) {
                    currentDir = 0;
                    tempCount++;
                }
            } else if (currentDir == 0) {
                if (A[i] > A[i - 1]) {
                    tempCount++;
                } else if (A[i] < A[i - 1]) {
                    currentDir = 1;
                    tempCount++;
                } else {
                    currentDir = -1;
                    tempCount = 0;
                }
            } else if (currentDir == 1) {
                if (A[i] >= A[i - 1]) {
                    maxLength = Math.max(maxLength, tempCount);
                    tempCount = 0;
                    currentDir = -1;
                    i--;
                } else if (A[i] < A[i - 1]) {
                    tempCount++;
                }
            }
        }
        if (currentDir == 1) {
            maxLength = Math.max(maxLength, tempCount);
        }
        if (maxLength == 0) return 0;
        return maxLength + 1;
    }

    public static void testCase1() {
        int[] nums = {875,884,239,731,723,685};
        System.out.println(longestMountain(nums));
    }

    public static void main(String[] args) {
        testCase1();
    }
}
