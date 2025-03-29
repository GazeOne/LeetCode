package interview150;

import java.util.ArrayList;
import java.util.List;

public class _57Insert {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        int start = newInterval[0];
        int end = newInterval[1];
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();
        boolean added = false;


        for (int i = 0; i < n; i++) {
            int[] item = intervals[i];
            if (item[0] > end) {

                if (!added) {
                    result.add(new int[]{start, end});
                    added = true;
                }
                result.add(intervals[i]);

            } else if (item[1] < start) {
                result.add(intervals[i]);
            } else {
                start = Math.min(start, item[0]);
                end = Math.max(end, item[1]);
            }
        }

        if (!added) {
            result.add(new int[] {start, end});
        }

        int[][] ans = new int[result.size()][2];
        for (int i = 0; i < result.size(); ++i) {
            ans[i] = result.get(i);
        }
        return ans;

    }

}
