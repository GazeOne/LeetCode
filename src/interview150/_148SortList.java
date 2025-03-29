package interview150;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _148SortList {

    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        while (head != null) {
            queue.offer(head);
            head = head.next;
        }

        ListNode temp = null;

        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            if (temp == null) {
                head = node;
                temp = node;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }
        if (temp != null)
            temp.next = null;
        return head;
    }

}
