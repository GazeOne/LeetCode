package interview150;

public class _100IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null && p.val == q.val) {
            boolean isSameLeft = isSameTree(p.left, q.left);
            boolean isSameRight = isSameTree(p.right, q.right);
            return isSameLeft && isSameRight;
        } else {
            return false;
        }

    }

}
