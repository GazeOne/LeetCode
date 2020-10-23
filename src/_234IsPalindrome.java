import java.util.ArrayList;
import java.util.List;

public class _234IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        List<Integer> data = new ArrayList<>();

        while (head != null) {
            data.add(head.val);
            head = head.next;
        }

        int size = data.size();
        int low = 0;
        int high = size - 1;

        while (low < high) {
            if (data.get(low).intValue() == data.get(high).intValue()) {
                low++;
                high--;
            } else {
                return false;
            }
        }
        return true;
    }

}
