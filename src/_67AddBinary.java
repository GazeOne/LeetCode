import java.util.Stack;

public class _67AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int up = 0;

        while (aLen >= 0 && bLen >= 0) {
            int result = a.charAt(aLen) - '0' + b.charAt(bLen) - '0' + up;
            sb.insert(0, result % 2);
            up = result > 1 ? 1 : 0;
            aLen--;
            bLen--;
        }

        while (aLen >= 0) {
            int result = a.charAt(aLen) - '0' + up;
            sb.insert(0, result % 2);
            up = result > 1 ? 1 : 0;
            aLen--;
        }

        while (bLen >= 0) {
            int result = b.charAt(bLen) - '0' + up;
            sb.insert(0, result % 2);
            up = result > 1 ? 1 : 0;
            bLen--;
        }

        if (up > 0) sb.insert(0, up);
        return sb.toString();
    }

}
