import java.util.Stack;

public class _66PlusOne {

    public int[] plusOne(int[] digits) {
        int m = digits.length;
        int up = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = m - 1; i >= 0; i--) {
            if (i == m - 1) {
                if (digits[i] + 1 >= 10) {
                    stack.push((digits[i] + 1) % 10);
                    up = 1;
                } else {
                    stack.push((digits[i] + 1) % 10);
                    up = 0;
                }
            } else {
                if (up == 0) {
                    stack.push(digits[i]);
                } else {
                    stack.push((digits[i] + up) % 10);
                    if (digits[i] + up >= 10) up = 1;
                    else up = 0;
                }
            }
        }
        if (up > 0) stack.push(up);
        int size = stack.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = stack.pop();
        }
        return result;
    }

}
