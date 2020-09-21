import java.util.ArrayList;
import java.util.List;

public class _538ConvertBST {

    List<TreeNode> list = new ArrayList<>();

    public TreeNode convertBST(TreeNode root) {
        middleTravel(root);
        int current = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            list.get(i).val += current;
            current = list.get(i).val;
        }

        return root;
    }

    public void middleTravel(TreeNode root) {
        if (root != null) {
            middleTravel(root.left);
            list.add(root);
            middleTravel(root.right);
        }
    }


}
