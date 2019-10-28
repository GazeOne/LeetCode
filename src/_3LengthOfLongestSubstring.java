
public class _3LengthOfLongestSubstring {

/*    给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

    示例 1:

    输入: "abcabcbb"
    输出: 3
    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    示例 2:

    输入: "bbbbb"
    输出: 1
    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
    示例 3:

    输入: "pwwkew"
    输出: 3
    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
                 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/

    //这样的到的最长子序列，不对
//    public int lengthOfLongestSubstring(String s) {
//        if (s.length() <= 0) return 0;
//        else if (s.length() == 1) return 1;
//        else {
//            String sub = s.substring(0, s.length() - 1);
//            String c = s.charAt(s.length() - 1) + "";
//            if (sub.contains(c)) {
//                return lengthOfLongestSubstring(s.substring(0, s.length() - 1));
//            } else {
//                return lengthOfLongestSubstring(s.substring(0, s.length() - 1)) + 1;
//            }
//        }
//    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int tempMax = 0;
        char[] strs = s.toCharArray();
        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i] + "";
            tempMax = 1;
            for (int j = i + 1; j < strs.length; j++) {
                if (temp.contains(strs[j] + "")) break;
                else {
                    tempMax += 1;
                    temp = temp + strs[j];
                }
            }
            if (tempMax > max) max = tempMax;
            if (max >= 26) return max;
        }
        return max;
    }

    //官方最优解
/*    方法三：优化的滑动窗口
    上述的方法最多需要执行 2n 个步骤。事实上，它可以被进一步优化为仅需要 n 个步骤。我们可以定义字符到索引的映射，而不是使用集合来判断一个字符是否存在。 当我们找到重复的字符时，我们可以立即跳过该窗口。

    也就是说，如果 s[j]s[j] 在 [i, j)[i,j) 范围内有与 j'j
            ′
    重复的字符，我们不需要逐渐增加 ii 。 我们可以直接跳过 [i，j'][i，j
            ′
            ] 范围内的所有元素，并将 ii 变为 j' + 1j
            ′
            +1。

    Java（使用 HashMap）

    Java
    public class Solution {
        public int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return ans;
        }
    }*/

}
