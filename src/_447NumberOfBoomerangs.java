import java.util.HashMap;
import java.util.Map;

public class _447NumberOfBoomerangs {

    public static int numberOfBoomerangs(int[][] points) {
        int size = points.length;
        int[][] distance = new int[size][size];
        Map<Integer, Integer> rowValue = new HashMap<>();
        int result = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                distance[i][j] = getDistance(points[i], points[j]);
                if (rowValue.containsKey(distance[i][j])) {
                    int value = rowValue.get(distance[i][j]);
                    value++;
                    rowValue.put(distance[i][j], value);

                    if (value > 2) {
                        result -= getProny(value - 1);
                    }
                    result += getProny(value);

                } else {
                    rowValue.put(distance[i][j], 1);
                }
            }
            rowValue.clear();
        }

        return result;
    }

    private static int getProny(int n) {
        return n*(n-1);
    }

    private static int getDistance(int[] point, int[] point1) {
        int x = point[0] - point1[0];
        int y = point[1] - point1[1];

        return x * x + y * y;
    }

    public static void main(String[] args) {
        int[][] points = {
                {0, 0},
                {1, 0},
                {2, 0}
        };

        System.out.println(numberOfBoomerangs(points));
    }
}
