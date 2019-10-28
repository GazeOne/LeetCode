/*
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

        示例：

        给定一个链表: 1->2->3->4->5, 和 n = 2.

        当删除了倒数第二个节点后，链表变为 1->2->3->5.
*/

public class _19RFemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode root = head;
        ListNode current = root;
        ListNode prev = root;
        ListNode prevprev = prev;
        int tempDistance = 0;
        while (current.next != null) {
            if (tempDistance < n - 1) {
                current = current.next;
                tempDistance++;
            } else {
                current = current.next;
                prevprev = prev;
                prev = prev.next;
            }
        }
        if (tempDistance >= n - 1) {
            //删除节点prev;
            //首节点
            if (prevprev == prev) {
                root = prev.next;
                prev = null;
            } else if (prev.next == null) { //尾结点
                prevprev.next = null;
            } else {
                prevprev.next = prev.next;
                prev.next = null;
            }
        }
        return root;
    }
}
