public class _27RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    j--;
                } else {
                    nums[i] = nums[j];
                    i++;
                    j--;
                }
            } else {
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        removeElement(nums,3);
    }

}
