package interview150;

import java.util.ArrayList;
import java.util.List;

public class _228SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();

        List<String> list = new ArrayList<>();

        int start = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {

            if (nums[i] - nums[i - 1] != 1) {
                if (start == nums[i - 1]) {
                    list.add(start + "");
                } else {
                    list.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
            }

        }

        if (start == nums[n - 1]) {
            list.add(start + "");
        } else {
            list.add(start + "->" + nums[n - 1]);
        }

        return list;
    }

}
