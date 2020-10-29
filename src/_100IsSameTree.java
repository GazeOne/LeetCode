import java.util.LinkedList;
import java.util.Queue;

public class _100IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();

        if (p!=null && q!=null) {
            pQueue.offer(p);
            qQueue.offer(q);
        } else if (q==null && p == null) {
            return true;
        }else{
            return false;
        }

        while (!pQueue.isEmpty() && !qQueue.isEmpty()) {

            TreeNode pNode = pQueue.poll();
            TreeNode qNode = qQueue.poll();

            if (pNode.val == qNode.val) {

                if ((pNode.left!=null && qNode.left!=null)||(pNode.left==null && qNode.left==null)) {
                    if (pNode.left!=null && qNode.left!=null) {
                        pQueue.offer(pNode.left);
                        qQueue.offer(qNode.left);
                    }
                }else {
                    return false;
                }

                if ((pNode.right!=null && qNode.right!=null) || (pNode.right==null && qNode.right==null)) {
                    if (pNode.right!=null && qNode.right!=null) {
                        pQueue.offer(pNode.right);
                        qQueue.offer(qNode.right);
                    }
                }else{
                    return false;
                }

            }else{
                return false;
            }
        }

        return pQueue.isEmpty() && qQueue.isEmpty();
    }

}
