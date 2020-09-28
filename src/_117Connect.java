import java.util.LinkedList;
import java.util.Queue;

public class _117Connect {

    public Node connect(Node root) {

        Queue<Node> queue = new LinkedList<>();
        if (root!=null) {
            queue.offer(root);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node current = queue.poll();
            for (int i = 0; i<size;i++) {
                if (i < size-1) {
                    Node next = queue.poll();
                    current.next = next;
                    if (current.left !=null) queue.offer(current.left);
                    if (current.right!=null) queue.offer(current.right);
                    current = next;
                } else {
                    current.next = null;
                    if (current.left !=null) queue.offer(current.left);
                    if (current.right!=null) queue.offer(current.right);
                }
            }
        }
        return root;
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
