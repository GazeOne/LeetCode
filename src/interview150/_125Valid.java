package interview150;

public class _125Valid {

    public static boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        int start = 0;
        int end = c.length - 1;
        char ss;
        char ee;
        while (start < end) {
            while (true) {
                 ss = c[start];
                if (!Character.isLetterOrDigit(ss)) {
                    start++;
                    if (start >= end) return true;
                }
                else break;
            }

            while (true) {
                 ee = c[end];
                if (!Character.isLetterOrDigit(ee)) {
                    end--;
                    if (end <= start) return true;
                }
                else break;
            }

            if (ss == ee) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

}
