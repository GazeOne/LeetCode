public class _24SwapPairs {

    /*给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

    你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

    示例:

    给定 1->2->3->4, 你应该返回 2->1->4->3.*/

    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next == null) return head;

        ListNode swap1 = head;
        ListNode swap2 = head.next;
        ListNode prev=null;

        while (swap2 != null) {
            //交换
//            swap(swap1,swap2,prev);
//            //重置swap1，swap2,prev
//            reset(swap1,swap2,prev);

            if(prev==null){
                swap1.next= swap2.next;
                swap2.next=swap1;
                head = swap2;
            }else{
                ListNode next = swap2.next;
                prev.next=swap2;
                swap1.next=next;
                swap2.next=swap1;
            }

            prev = swap1;
            swap1 = swap1.next;
            if(swap1 == null){
                return head;
            }
            swap2= swap1.next;
        }

        return head;
    }

    void swap(ListNode node1,ListNode node2,ListNode prev){
        if(prev==null){
            node1.next= node2.next;
            node2.next=node1;
        }else{
            ListNode next = node2.next;
            prev.next=node2;
            node1.next=next;
            node2.next=node1;
        }
    }

    void reset(ListNode node1,ListNode node2,ListNode prev){
            prev = node1;
            node1 = node1.next;
            if(node1 == null){
                return;
            }
            node2= node1.next;
    }

}
