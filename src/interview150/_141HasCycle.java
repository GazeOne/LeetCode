package interview150;

public class _141HasCycle {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null) {
            slow = slow.next;
            if (slow == null) return false;
            fast = fast.next;

            if (fast == null) return false;

            fast = fast.next;

            if (fast == slow) return true;
        }

        return false;

    }

}
