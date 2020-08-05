public class _28StrStr {

    public int strStr(String haystack, String needle) {

        int i = 0;
        int j = 0;
        int nextIndex = 0;
        boolean flag = false;
        while (i < haystack.length()) {
            while (j < needle.length()) {
                if (needle.charAt(j) == haystack.charAt(i)) {
                    i++;
                    j++;
                    if (haystack.charAt(i) == needle.charAt(0) && nextIndex < i && !flag) {
                        nextIndex = i;
                        flag = true;
                    }
                } else {
                    j = 0;
                    if (flag) {
                        i = nextIndex;
                        flag = false;
                    } else i++;
                }
            }
            return nextIndex;
        }
        return 0;

    }

    public int str(String haystack, String needle) {
        int i = 0;
        int j = 0;
        int nextIndex = 0;
        int currentIndex = 0;
        boolean flag = false;
        if (needle.isEmpty()) return 0;
        while (i < haystack.length() && j < needle.length()) {

            if (haystack.charAt(i) == needle.charAt(j) && j == needle.length() - 1) {
                return currentIndex;
            }

            if (haystack.charAt(i) == needle.charAt(0) && nextIndex < i && !flag) {
                nextIndex = i;
                flag = true;
            }

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                if (flag) {
                    i = nextIndex;
                    j = 0;
                    flag = false;
                    currentIndex = i;
                } else {
                    i++;
                    j = 0;
                    currentIndex = i;
                }
            }
        }
        return -1;
    }

}
