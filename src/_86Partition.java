import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _86Partition {

    public ListNode partition(ListNode head, int x) {

        Queue<ListNode> less = new LinkedList<>();
        Queue<ListNode> more = new LinkedList<>();

        while (head != null) {
            if (head.val<x) {
                less.offer(head);
            } else {
                more.offer(head);
            }
            head = head.next;
        }

        head = null;
        ListNode previous = null;

        while (!less.isEmpty()) {
            ListNode temp = less.poll();
            if (head == null) {
                head = temp;
            }
            if (previous == null){
                previous=temp;
            }else{
                previous.next = temp;
                previous = temp;
            }
        }

        while (!more.isEmpty()) {
            ListNode temp = more.poll();
            if (head == null) {
                head = temp;
            }
            if (previous == null){
                previous=temp;
            }else{
                previous.next = temp;
                previous = temp;
            }
        }

        if (previous!=null) previous.next=null;

        return head;
    }

}
