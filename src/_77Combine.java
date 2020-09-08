import java.util.ArrayList;
import java.util.List;

public class _77Combine {

    public static List<List<Integer>> combine(int n, int k) {

        // if (n == 0 || n < k) return null;

        List<List<Integer>> result = new ArrayList<>();

        if (n == k) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(i + 1);
            }
            result.add(temp);
            return result;
        } else if (k == 1) {
            for (int i = 0; i < n; i++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i + 1);
                result.add(temp);
            }
            return result;
        } else {
            List<List<Integer>> containN = combine(n - 1, k);
            List<List<Integer>> notContainN = combine(n - 1, k - 1);

            for (int i = 0; i < notContainN.size(); i++) {
                notContainN.get(i).add(n);
            }

            result.addAll(containN);
            result.addAll(notContainN);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = combine(4, 2);

         printlnResult(result);
    }

    private static void printlnResult(List<List<Integer>> result) {
        for (int i = 0; i < result.size(); i++) {
            List<Integer> data = result.get(i);
            for (int j = 0; j < data.size(); j++) {
                System.out.print(data.get(j) + "  ");
            }
            System.out.println();
        }
    }

}
