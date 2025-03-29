public class _19DeleteN {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) return null;

        ListNode next;
        ListNode preN;
        ListNode nn;
        int count = 0;

        preN = null;
        nn = head;
        next = head;

        while (next != null) {
            if (count >= n) {
                preN = nn;
                nn = nn.next;
            }

            next = next.next;
            count++;
        }

        if (preN != null) {
            preN.next = nn.next;
            nn.next = null;
        } else {
            head = head.next;
        }

        return head;
    }

}
