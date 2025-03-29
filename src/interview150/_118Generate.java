package interview150;

import java.util.ArrayList;
import java.util.List;

public class _118Generate {

    public List<List<Integer>> generate(int numRows) {

        int[][] data = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            data[i][0] = 1;
            data[i][i] = 1;
        }

        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < numRows - 1; j++) {
                data[i][j] = data[i - 1][j - 1] + data[i - 1][j];
            }
        }
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> item = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                item.add(data[i][j]);
            }
            result.add(item);
        }

        return result;
    }
}
