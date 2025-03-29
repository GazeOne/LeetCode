package interview150;

public class _21MergeTwoList2 {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return  list1;

        ListNode head = null;
        ListNode tail = null;
        ListNode l1Current = list1;
        ListNode l2Current = list2;

        while (l1Current != null && l2Current != null) {
            int val1 = l1Current.val;
            int val2 = l2Current.val;

            if (val1 < val2) {
                if (head == null) {
                    head = l1Current;
                    tail = l1Current;
                    l1Current=l1Current.next;
                } else {
                    tail.next = l1Current;
                    tail = tail.next;
                    l1Current = l1Current.next;
                }
            } else {
                if (head == null) {
                    head = l2Current;
                    tail = l2Current;
                    l2Current = l2Current.next;
                } else {
                    tail.next = l2Current;
                    tail = tail.next;
                    l2Current = l2Current.next;
                }
            }
        }

        if (l1Current == null && tail != null) tail.next = l2Current;
        if (l2Current == null && tail != null) tail.next = l1Current;
        return head;
    }

    public static void main(String[] args) {
        ListNode l10 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);

        l10.next = l11;
        l11.next = l12;
        l12.next = null;

        ListNode l20 = new ListNode(1);
        ListNode l21 = new ListNode(3);
        ListNode l22 = new ListNode(4);

        l20.next = l21;
        l21.next = l22;
        l22.next = null;

        mergeTwoLists(l10, l20);

    }
}


