public class _61RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) return head;

        int sum = 0;
        ListNode temp = head;
        ListNode last = null;
        while (temp != null) {
            sum += 1;
            last = temp;
            temp = temp.next;
        }

        int bias = k % sum;
        int rotateIndex = sum - bias;
        ListNode previous = null;
        ListNode current = head;
        if (rotateIndex == sum) return head;
        while (rotateIndex > 0) {
            previous = current;
            current = current.next;
            rotateIndex--;
        }
        last.next = head;
        previous.next = null;
        return current;
    }
}
