package interview150;

public class _226InvertTree {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) return root;

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = right;
        root.right = left;

        invertTree(left);
        invertTree(right);

        return root;
    }

}
