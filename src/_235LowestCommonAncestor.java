public class _235LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int maxVal = Math.max(p.val, q.val);
        int minVal = Math.min(p.val, q.val);

        return dfs(root, maxVal, minVal);
    }

    private TreeNode dfs(TreeNode root, int maxVal, int minVal) {

        if (maxVal > root.val && minVal < root.val) {
            return root;
        }

        if (maxVal < root.val) {
            return dfs(root.left, maxVal, minVal);
        }
        if (minVal > root.val) {
            return dfs(root.right, maxVal, minVal);
        }
        return root;
    }

}
