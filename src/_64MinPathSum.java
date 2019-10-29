public class _64MinPathSum {

/*    给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

    说明：每次只能向下或者向右移动一步。

    示例:

    输入:
            [
              [1,3,1],
            [1,5,1],
            [4,2,1]
            ]
    输出: 7
    解释: 因为路径 1→3→1→1→1 的总和最小。*/

/*
    public int calculate(int[][] grid, int i, int j) {
        if (i == grid.length || j == grid[0].length) return Integer.MAX_VALUE;
        if (i == grid.length - 1 && j == grid[0].length - 1) return grid[i][j];
        return grid[i][j] + Math.min(calculate(grid, i + 1, j), calculate(grid, i, j + 1));
    }
    public int minPathSum(int[][] grid) {
        return calculate(grid, 0, 0);
    }
*/

    public int minPathSum(int[][] grid) {

        int row = grid.length - 1;
        int column = grid[0].length - 1;
        for (int i = row; i >= 0; i--) {
            for (int j = column; j >= 0; j--) {
                if (i < row && j < column) {
                    grid[i][j] = grid[i][j] + Math.min(grid[i + 1][j], grid[i][j + 1]);
                } else if (i < row) {
                    grid[i][j] += grid[i + 1][j];
                } else if (j < column) {
                    grid[i][j] += grid[i][j + 1];
                }
            }
        }
        return grid[0][0];
    }

}
