import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _113PathSum {

    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {

        if (root == null) return result;

        Stack<Integer> item = new Stack<>();
        dfs(root, sum, item);
        return result;
    }

    private static void dfs(TreeNode root, int sum, Stack<Integer> item) {

        if (sum - root.val == 0 && root.left == null && root.right == null) {
            List<Integer> temp = new ArrayList<>(item);
            temp.add(root.val);
            result.add(temp);
            return;
        }

        item.push(root.val);
        if (root.left != null) {
            dfs(root.left, sum - root.val, item);
        }
        if (root.right != null) {
            dfs(root.right, sum - root.val, item);
        }
        item.pop();

    }

    private static void testCase1() {
        TreeNode root = null;
        _39CombinationSum.printlnData(pathSum(root, 1));

    }

    private static void testCase2() {
        TreeNode root = new TreeNode(5);

        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(8);

        TreeNode t1 = new TreeNode(11);
        TreeNode t2 = new TreeNode(13);
        TreeNode t3 = new TreeNode(4);

        TreeNode f1 = new TreeNode(7);
        TreeNode f2 = new TreeNode(2);
        TreeNode f3 = new TreeNode(5);
        TreeNode f4 = new TreeNode(1);

        root.left = left;
        root.right = right;
        left.left = t1;
        left.right = null;
        right.left = t2;
        right.right = t3;
        t1.left = f1;
        t1.right = f2;
        t2.left = null;
        t2.right = null;
        t3.left = f3;
        t3.right = f4;


        _39CombinationSum.printlnData(pathSum(root, 22));
    }

    private static void testCase3() {
        TreeNode root = new TreeNode(1);
        _39CombinationSum.printlnData(pathSum(root, 1));

    }

    private static void testCase4() {
        TreeNode root = new TreeNode(-2);
        TreeNode right = new TreeNode(-3);
        root.left = null;
        root.right = right;
        _39CombinationSum.printlnData(pathSum(root, -5));
    }

    public static void main(String[] args) {

        testCase4();

    }

}
