package interview150;

public class _283MoveZeroes {

    public void moveZeroes(int[] nums) {
        int end = nums.length;
        int zeroIndex = 0;
        int noneZeroIndex = 0;

        while (zeroIndex < end) {
            if (nums[zeroIndex] != 0) {
                zeroIndex++;
                noneZeroIndex++;
            } else {
                while (noneZeroIndex < end) {
                    if (nums[noneZeroIndex] != 0) {
                        swap(nums, zeroIndex, noneZeroIndex);
                        break;
                    } else {
                        noneZeroIndex++;
                    }
                }
                if (noneZeroIndex >= end) break;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
