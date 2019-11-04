public class _7Reverse {
    /*给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

    示例 1:

    输入: 123
    输出: 321
             示例 2:

    输入: -123
    输出: -321
    示例 3:

    输入: 120
    输出: 21*/

    public int reverse(int x) {
        long result = 0L;
        int sign = 1;
        if (x < 0) sign = -1;
        x = Math.abs(x);
        while (x > 0) {
            result = result * 10 + x % 10;
            if (result * sign > Integer.MAX_VALUE || result * sign < Integer.MIN_VALUE) return 0;
            x = x / 10;
        }
        return (int) (result * sign);
    }
}
