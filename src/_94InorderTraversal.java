import java.util.ArrayList;
import java.util.List;

public class _94InorderTraversal {

    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        traversal(root);
        return result;
    }

    private void traversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
    }
}
