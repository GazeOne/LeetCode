
public class _925IsLongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        char previcous = name.charAt(0);
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                previcous = typed.charAt(j);
                i++;
                j++;
            } else {
                if (previcous == typed.charAt(j)) {
                    j++;
                }else{
                    return false;
                }
            }
        }

        if (i >= name.length()) {
            while (j<typed.length()) {
                if (previcous == typed.charAt(j)) j++;
                else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
