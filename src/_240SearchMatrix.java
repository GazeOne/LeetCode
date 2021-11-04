public class _240SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int x = m-1;
        int y = 0;
        while (x >= 0 && y < n) {

            if (matrix[x][y] > target) {
                x--;
            } else if (matrix[x][y] < target) {
                y++;
            } else if (matrix[x][y] == target) {
                return true;
            }

        }
        return false;
    }

}
