import java.util.ArrayList;
import java.util.List;

public class _144PreorderTraversal {

    List<Integer> tempList = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return tempList;
        tempList.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return tempList;
    }

}
