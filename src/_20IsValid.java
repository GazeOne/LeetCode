public class _20IsValid {
   /* 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

    有效字符串需满足：

    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。
    注意空字符串可被认为是有效字符串。

    示例 1:

    输入: "()"
    输出: true
    示例 2:

    输入: "()[]{}"
    输出: true
    示例 3:

    输入: "(]"
    输出: false
    示例 4:

    输入: "([)]"
    输出: false
    示例 5:

    输入: "{[]}"
    输出: true*/

    public boolean isValid(String s) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp == '(' || temp == '[' || temp == '{'){
                builder.append(temp);
            }else{
                if(builder.length()<=0) return false;
                char prev = builder.charAt(builder.length() - 1);
                if((prev == '(' && temp == ')')
                ||(prev == '[' && temp == ']')
                ||(prev == '{' && temp == '}')){
                    builder.deleteCharAt(builder.length()-1);
                }else{
                    return false;
                }
            }
        }
        if(builder.length() == 0) return true;
        return false;
    }
}
