import java.util.Arrays;

public class _453MinMoves {

    public int minMoves(int[] nums) {
        if (nums.length <=1) return 0;
        int first = nums[0];
        boolean flag = false;
        for (int i=1;i<nums.length;i++) {
            if (first == nums[i]) {
                flag = true;
                continue;
            } else {
                flag = false;
                break;
            }
        }

        if (flag) return 0;
        else {
            int n = nums.length;
            int sum = 0;
            for (int i =0;i<nums.length;i++) {
                sum+=nums[i];
            }
            int count = 1;
            while (true) {
                int temp = (sum+(n-1)*count);
                if (temp%n == 0) {
                    return count;
                } else count++;
            }
        }
    }
}
