public class _844BackspaceCompare {

    public boolean backspaceCompare(String S, String T) {
        return formatStr(S).equals(formatStr(T));
    }

    public String formatStr(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (stringBuilder.length() > 0) {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

}
