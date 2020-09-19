import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class _404SumOfLeftLeaves {

    public static int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        Queue<TreeNode> tree = new LinkedList<>();
        if (root != null) {
            tree.offer(root);
        }
        while (!tree.isEmpty()) {
            TreeNode node = tree.poll();
            if (node.left != null) {
                if (node.left.right == null && node.left.left == null)
                    result += node.left.val;
                else tree.offer(node.left);

            }
            if (node.right != null) tree.offer(node.right);
        }
        return result;
    }

    public static void main(String[] args) {
        //[3,9,20,null,null,15,7]
        TreeNode current = new TreeNode(3);
        TreeNode root = current;
        current.left = new TreeNode(9);
        current.right = new TreeNode(20);
        current = current.right;
        current.left = new TreeNode(15);
        current.right = new TreeNode(7);

        int result = sumOfLeftLeaves(root);
        System.out.println("-------" + result);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

