package interview150;

public class _35SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;

        while (start <= end) {
            middle = (start + end) / 2;
            if (nums[middle] == target) return middle;
            else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }
}
