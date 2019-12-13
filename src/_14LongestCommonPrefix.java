public class _14LongestCommonPrefix {

    /*编写一个函数来查找字符串数组中的最长公共前缀。

    如果不存在公共前缀，返回空字符串 ""。

    示例 1:

    输入: ["flower","flow","flight"]
    输出: "fl"
    示例 2:

    输入: ["dog","racecar","car"]
    输出: ""
    解释: 输入不存在公共前缀。*/

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length <= 0) return "";
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (result.equals("")) return "";
            result = getCommonPrefix(result, strs[i]);
        }
        return result;
    }

    public static String getCommonPrefix(String str1, String str2) {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) builder.append(str1.charAt(i));
            else return builder.toString();
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String[] data = new String[]{};
        longestCommonPrefix(data);
    }
}
