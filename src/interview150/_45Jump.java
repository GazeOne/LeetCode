package interview150;

public class _45Jump {

    public static int jump(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        int index = 0;
        int max = 0;
        int count = 0;
        int i = 0;
        while (i < nums.length) {

            max = Math.max(max, i + nums[i]);
            if (max >= nums.length - 1) return count + 1;

            int tempMax = 0;

            for (int j = i ; j <= max; j++) {

                if (j + nums[j] > tempMax) {
                    index = j;
                    tempMax = j + nums[j];
                }
            }
            count++;
            i = index;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,3,1,1,4};
        System.out.println(jump(array));
    }
}
