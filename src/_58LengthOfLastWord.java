public class _58LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s.trim().equals("")) return 0;
        String[] temp = s.split(" ");
        return temp[temp.length-1].length();
    }

}
