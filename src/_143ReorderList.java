import java.util.*;

public class _143ReorderList {

    public void reorderList(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        int count = 0;
        while (head != null) {
            map.putIfAbsent(count, head);
            count++;
            head = head.next;
        }
        int index = 0;
        ListNode current = null;
        while (index < count / 2) {
            if (current == null) {
                current = map.get(index);
                head = current;
                current.next = map.get(count - index - 1);
                current = current.next;
            } else {
                ListNode temp = map.get(index);
                temp.next = map.get(count - index - 1);
                current.next = temp;
                current = temp.next;
            }
            index++;
        }
        if (count % 2 == 1 && current != null) {
            current.next = map.get(count / 2);
            current.next.next = null;
        } else if (current != null) {
            current.next = null;
        }
    }

}
