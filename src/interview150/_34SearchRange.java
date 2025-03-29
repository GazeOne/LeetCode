package interview150;

public class _34SearchRange {

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int n = nums.length;
        int end = n - 1;
        int startIndex = -1;
        int endIndex = -1;
        boolean find = false;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                startIndex = middle;
                endIndex = middle;
                find = true;
                while (startIndex >= 0) {
                    if (nums[startIndex] == target) {
                        startIndex--;
                    } else {
                        break;
                    }
                }
                while (endIndex < n) {
                    if (nums[endIndex] == target) {
                        endIndex++;
                    } else {
                        break;
                    }
                }
                break;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        if (find) {
            return new int[]{startIndex + 1, endIndex - 1};
        } else {
            return new int[]{startIndex, endIndex};
        }
    }

    public static void main(String[] args) {
        searchRange(new int[]{1}, 1);
    }

}
