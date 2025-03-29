package interview150;

public class _33Search {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int n = nums.length;

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (nums[middle] == target) {
                return middle;
            } else if (nums[0] <= nums[middle]) { // start 到middle有序
                if (nums[0] <= target && target < nums[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else { // middle 到end有序
                if (nums[middle] < target && target <= nums[n - 1]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }

        return -1;
    }

}
