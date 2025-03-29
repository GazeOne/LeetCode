package interview150;

public class _392IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() <=0) return true;
        int sIndex = 0;
        int tIndex = 0;
        int n = t.length();
        int m = s.length();
        while (tIndex < n) {

            char ti = t.charAt(tIndex);
            char si = s.charAt(sIndex);

            if (ti == si) {
                tIndex++;
                sIndex++;
            } else {
                tIndex++;
            }

            if (sIndex >= m) return true;
        }
        return false;
    }

}
