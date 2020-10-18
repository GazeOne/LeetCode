import java.util.Arrays;

public class _70ClimbStairs {

    public int climbStairs(int n) {

        if (n == 1) return 1;
        int result = 0;
        int result0 = 1;
        int result1 = 1;
        for (int i = 2; i <= n; i++) {
            result = result0 + result1;
            result0 = result1;
            result1 = result;
        }
        return result;
    }

    public double trimMean(int[] arr) {

        if (arr == null) return 0;

        int size = arr.length;
        int deleteSize = size * 5 / 100;
        deleteSize = (deleteSize == 0 ? deleteSize : deleteSize);

        Arrays.sort(arr);
        double sum = 0.0;
        double count = 0.0;
        for (int i = deleteSize; i < size - deleteSize; i++) {
            sum += arr[i];
            count++;
        }
        return sum / count;
    }

    public int[] bestCoordinate(int[][] towers, int radius) {

        int minI = Integer.MAX_VALUE;
        int maxI = Integer.MIN_VALUE;
        int minJ = Integer.MAX_VALUE;
        int maxJ = Integer.MIN_VALUE;

        for (int i = 0; i < towers.length; i++) {
            minI = Math.min(towers[i][0], minI);
            maxI = Math.max(towers[i][0], maxI);
            minJ = Math.min(towers[i][1], minJ);
            maxJ = Math.max(towers[i][1], maxJ);
        }

        int rMinI = minI - radius;
        int rMaxI = maxI + radius;
        int rMinJ = minJ - radius;
        int rMaxJ = maxJ + radius;

        int maxQ = Integer.MIN_VALUE;
        int[] result = new int[2];

        for (int i = rMinI; i <= rMaxI; i++) {
            for (int j = rMinJ; j <= rMaxJ; j++) {
                int q = calQ(towers, i, j, radius);
                if (q > maxQ) {
                    result[0] = i;
                    result[1] = j;
                    maxQ = q;
                }
            }
        }
        return result;
    }

    private int calQ(int[][] towers, int x, int y, int radius) {
        int q = 0;
        for (int i = 0; i < towers.length; i++) {
            q += signal(towers[i][0], towers[i][1], towers[i][2], x, y, radius);
        }

        return q;
    }

    private int signal(int i, int i1, int q, int x, int y, int radius) {

        int d = (x - i) * (x - i) + (y - i1) * (y - i1);
        int m = radius * radius;
        if (d <= m) {
            return (int) Math.floor(q / (1 + Math.sqrt(d)));
        }

        return 0;
    }


}
