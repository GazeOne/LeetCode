import java.util.Arrays;

public class _31NextPermutation {

    public static void nextPermutation(int[] nums) {

        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, len);
                for (int j = i; j <len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
    }



    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 2};
        nextPermutation(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
    }

}
