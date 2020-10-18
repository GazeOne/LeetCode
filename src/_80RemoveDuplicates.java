public class _80RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int currerntNum = nums[0];
        int index = 0;
        int currentCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentCount >= 2 && currerntNum == nums[i]) {
                //index++;
            } else if (currerntNum == nums[i]) {
                nums[index] = nums[i];
                index++;
                currentCount++;
            } else if (currerntNum != nums[i]) {
                currerntNum = nums[i];
                currentCount = 1;
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        removeDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
