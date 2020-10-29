import java.util.ArrayList;

public class _129SumNumbers {

    public static int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public static int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.left = null;
        left.right = null;
        right.left = null;
        left.right = null;

        System.out.println(sumNumbers(root));
    }

}
