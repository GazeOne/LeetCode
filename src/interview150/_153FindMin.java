package interview150;

public class _153FindMin {

    public static int findMin(int[] nums) {
        int start = 0;
        int n = nums.length;
        int end = n - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int left = Math.max(middle - 1, 0);
            int right = Math.min(middle + 1, n - 1);
            if (nums[middle] <= nums[left] && nums[middle] <= nums[right]) {
                return nums[middle];
            } else if (nums[middle] > nums[end]) {
                start = middle + 1;
            } else {
                end = middle -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        findMin(new int[] {11,13,15,17});
    }

}
