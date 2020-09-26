import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _501FindMode {

    private Map<Integer, Integer> sequence = new HashMap<>();

    public int[] findMode(TreeNode root) {

        dfs(root);

        List<Integer> result = new ArrayList<>();
        int currentMaxCount = 0;
        for (Map.Entry<Integer, Integer> entry : sequence.entrySet()) {
            int mapValue = entry.getValue();
            if (mapValue > currentMaxCount) {
                result.clear();
                currentMaxCount = mapValue;
                result.add(entry.getKey());
            } else if (mapValue == currentMaxCount) {
                result.add(entry.getKey());
            }
        }

        int[] resultL = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultL[i] = result.get(i);
        }
        return resultL;
    }

    private void dfs(TreeNode root) {

        if (root == null) return;

        dfs(root.left);
        sequence.merge(root.val, 1, Integer::sum);
        dfs(root.right);
    }

}
