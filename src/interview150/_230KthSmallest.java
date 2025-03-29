package interview150;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _230KthSmallest {


    public int kthSmallest(TreeNode root, int k) {
//        List<Integer> integers = new ArrayList<>();
//         traval(root, integers);
//         return integers.get(k-1);

        Deque<TreeNode> nodes = new LinkedList<>();
        int count = 0;

        while (root != null || !nodes.isEmpty()) {
            while (root != null) {
                nodes.push(root);
                root = root.left;
            }
            root = nodes.pop();
            count++;
            if (count == k) break;
            root = root.right;
        }
        return root.val;
    }

    private void traval(TreeNode node , List<Integer> list) {
        if (node != null) {
            traval(node.left, list);
            list.add(node.val);
            traval(node.right, list);
        }
    }

}
