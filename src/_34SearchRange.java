public class _34SearchRange {

    public int[] searchRange(int[] nums, int target) {

        int res[] = new int[]{-1, -1};
        if (nums == null || nums.length == 0) return res;
        if (nums.length == 1) return nums[0] == target ? new int[]{0,0} : res;
        int low = 0, high = nums.length - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                int L = mid, R = mid;
                // 找到最左边和target相等的元素
                while (R + 1 < nums.length && nums[R+1] == target) R++;
                // 找到最友边和target相等的元素
                while (L - 1 >= 0 && nums[L-1] == target) L--;
                // 若唯一，没有重复出现，则 L = R = mid未改变
                res[0] = L;
                res[1] = R;
                return res;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return res;
    }

}
