import java.util.ArrayList;
import java.util.List;

public class _54SpiralOrder {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return result;

        int row = matrix.length;
        int column = matrix[0].length;

        int startI = 0;
        int endI = column;
        int startJ = 0;
        int endJ = row;

        int leftToRight = 0;
        int upToDown = 1;
        int rightToleft = 2;
        int downToUp = 3;

        int currentDirection = 0;
        int totalCount = row * column;
        int currentData = 0;

        while (currentData < totalCount) {

            if (currentDirection == leftToRight) {
                for (int k = startI; k < endI; k++) {
                    result.add(matrix[startJ][k]);
                    currentData++;
                }
                currentDirection = upToDown;
                startJ++;
                continue;
            }

            if (currentDirection == upToDown) {
                for (int k = startJ; k < endJ; k++) {
                    result.add(matrix[k][endI - 1]);
                    currentData++;
                }
                currentDirection = rightToleft;
                endI--;
                continue;
            }

            if (currentDirection == rightToleft) {
                for (int k = endI - 1; k >= startI; k--) {
                    result.add(matrix[endJ - 1][k]);
                    currentData++;
                }
                currentDirection = downToUp;
                endJ--;
                continue;
            }

            if (currentDirection == downToUp) {
                for (int k = endJ - 1; k >= startJ; k--) {
                    result.add(matrix[k][startI]);
                    currentData++;
                }
                currentDirection = leftToRight;
                startI++;
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> result = spiralOrder(matrix);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }


    public static void testCase2() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        List<Integer> result = spiralOrder(matrix);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }
}
