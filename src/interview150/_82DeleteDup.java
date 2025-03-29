package interview150;

public class _82DeleteDup {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = cur.next;
        boolean needDelete = false;

        while (cur != null && next != null) {
            if (cur.val == next.val) {
                next = next.next;
                needDelete = true;
            } else {
                if (needDelete) {
                    pre.next = next;
                    cur = next;
                    next = next.next;
                    needDelete = false;
                } else {
                    pre = cur;
                    cur = cur.next;
                    next = next.next;
                }
            }
        }

        if (needDelete) {
            pre.next = next;
        }

        return dummy.next;
    }

}
