import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class _496NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length-1;i>=0;i--) {

            while (!stack.isEmpty() && nums2[i] >= stack.peek()) {
                stack.pop();
            }
            map.put(nums2[i], stack.isEmpty()?-1:stack.peek());
            stack.push(nums2[i]);
        }

        int[] result = new int[nums1.length];
        for (int i = 0;i<nums1.length;i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }

}
