package interview150;

public class _287FindDuplicate {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            for (int j = i + 1; j< nums.length; j++) {
                int result = cur ^ nums[j];
                if (result == 0) return cur;
            }
        }
        return -1;
    }
}
