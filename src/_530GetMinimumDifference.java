public class _530GetMinimumDifference {

    private int ans = Integer.MAX_VALUE;
    private int pre = -1;

    public int getMinimumDifference(TreeNode root) {

        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {

        if (root == null) return;

        dfs(root.left);

        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }

        dfs(root.right);
    }

}
