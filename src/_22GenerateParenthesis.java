import java.util.ArrayList;
import java.util.List;

public class _22GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(result, sb, 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb, int left, int right, int max) {
        if (left == max && right == max) {
            result.add(sb.toString());
        }

        if (left <= max) {
            sb.append('(');
            backtrack(result, sb, left+1, right, max);
            sb.deleteCharAt(sb.length()-1);
        }
        if (right<left) {
            sb.append(')');
            backtrack(result, sb, left, right+1, max);
            sb.deleteCharAt(sb.length()-1);
        }
    }

}
