package interview150;

import java.util.Arrays;

public class _128LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int result = 0;
        int tempLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                tempLength++;
            } else if (nums[i] != nums[i -1]){
                result = Math.max(result, tempLength);
                tempLength = 1;
            }
        }
        result = Math.max(result, tempLength);

        return result;
    }

}
