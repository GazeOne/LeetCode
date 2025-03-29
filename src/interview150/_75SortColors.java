package interview150;

public class _75SortColors {

    public static void sortColors(int[] nums) {
        int start = 0;
        int n = nums.length;
        int end = n - 1;
        while (start < end) {
            if (nums[start] != 0) {
                while (end >= 0 && nums[end] != 0) {
                    end--;
                }
                if (end > start) {
                    swap(nums, start, end);
                    start++;
                } else {
                    break;
                }
            } else {
                start++;
            }
        }

        end = n - 1;
        start = 0;
        while (end > start) {
            if (nums[end] != 2) {
                while (start < end && nums[start] != 2 ) {
                    start++;
                }
                if (end > start) {
                    swap(nums, start, end);
                    end--;
                } else {
                    break;
                }
            } else {
                end--;
            }
        }
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void main(String[] args) {
        sortColors(new int[] {2,0,2,1,1,0});
    }

}
