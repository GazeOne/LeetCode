public class _2TwoNumPlus {
    /*给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

    如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

    您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

    示例：

    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807*/

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {

/*        ListNode result = new ListNode(0);
        ListNode curr = result;
        while (l1 != null || l2 != null) {
            int pVal = l1 == null ? 0 : l1.val;
            int qVal = l2 == null ? 0 : l2.val;

            int sum = pVal + qVal;
            curr.val += sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return result.val == 1 ? result : result.next;*/

        //判断可用三目运算符优化

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = null;
            ListNode current = result;
            int upWei = 0;

            while (l1 != null || l2 != null) {
                if (l1 != null && l2 != null) {
                    int data = l1.val + l2.val + upWei;
                    if (data > 9) {
                        data %= 10;
                        upWei = 1;
                    } else upWei = 0;
                    ListNode node = new ListNode(data);
                    if (result == null) {
                        result = node;
                        current = node;
                    } else {
                        current.next = node;
                        current = current.next;
                    }
                    l1 = l1.next;
                    l2 = l2.next;
                } else if (l1 != null) {
                    int data = l1.val + upWei;
                    if (data > 9) {
                        data %= 10;
                        upWei = 1;
                    } else upWei = 0;
                    ListNode node = new ListNode(data);
                    if (result == null) {
                        result = node;
                        current = node;
                    } else {
                        current.next = node;
                        current = current.next;
                    }
                    l1 = l1.next;
                } else if (l2 != null) {
                    int data = l2.val + upWei;
                    if (data > 9) {
                        data %= 10;
                        upWei = 1;
                    } else upWei = 0;
                    ListNode node = new ListNode(data);
                    if (result == null) {
                        result = node;
                        current = node;
                    } else {
                        current.next = node;
                        current = current.next;
                    }
                    l2 = l2.next;
                }
            }
            if (upWei == 1) {
                ListNode node = new ListNode(1);
                current.next = node;
                current = current.next;

            }
            return result;
        }
    }

    public class ListNode {
        ListNode next;
        int val;

        ListNode(int x) {
            val = x;
        }
    }
}
