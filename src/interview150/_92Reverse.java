package interview150;

public class _92Reverse {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode pre = dummyNode;
        for (int i = 0; i< left; i++) {
            pre = pre.next;
        }

        ListNode cur = pre.next;
        ListNode next;
        while (left < right) {

            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next=next;
            left++;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        head.next = l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=null;
        reverseBetween(head, 2, 4);
    }
}
