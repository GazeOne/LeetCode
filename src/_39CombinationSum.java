import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _39CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        // 直接跳过
        dfs(candidates, target, ans, combine, idx + 1);
        // 选择当前数
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }

    static void printlnData(List<List<Integer>> result) {
        for (int i = 0; i < result.size(); i++) {
            List<Integer> data = result.get(i);
            for (int j = 0; j < data.size(); j++) {
                System.out.print(data.get(j) + "  ");
            }
            System.out.println();
        }
    }
}
