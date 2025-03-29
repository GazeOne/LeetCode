package interview150;

public class _74SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int columns = matrix[0].length;

        for (int[] ints : matrix) {
            for (int j = 0; j < columns; j++) {
                if (target == ints[j]) return true;
            }
        }
        return false;
    }

}
