package interview150;

public class _58LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        int n = s.length() - 1;
        int count = 0;
        boolean start = false;
        while (n >= 0) {
            if (s.charAt(n) != ' ') {
                start = true;
                count++;
                n--;
            } else {
                if (!start) n--;
                else {
                    return count;
                }
            }
        }
        return count;
    }

}
