import java.util.HashSet;
import java.util.Set;

public class _142DetectCycle {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

}
