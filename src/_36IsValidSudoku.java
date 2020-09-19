import java.util.Map;

public class _36IsValidSudoku {

    public static boolean isValidSudoku(char[][] board) {

        boolean result = false;

        //check row
        for (int i = 0; i < board.length; i++) {
            result = checkIfhasRepeatValue(board[i]);
            if (!result) return false;
        }

        //check column
        for (int i = 0; i < board.length; i++) {
            char[] chars = new char[9];
            chars[0] = board[0][i];
            chars[1] = board[1][i];
            chars[2] = board[2][i];
            chars[3] = board[3][i];
            chars[4] = board[4][i];
            chars[5] = board[5][i];
            chars[6] = board[6][i];
            chars[7] = board[7][i];
            chars[8] = board[8][i];

            result = checkIfhasRepeatValue(chars);
            if (!result) return false;
        }

        //check square
        for (int i = 0; i < board.length; i += 3) {
            char[] chars = new char[9];
            for (int j = 0; j < board.length; j += 3) {
                chars[0] = board[i][j];
                chars[1] = board[i + 1][j];
                chars[2] = board[i + 2][j];
                chars[3] = board[i][j+1];
                chars[4] = board[i + 1][j+1];
                chars[5] = board[i + 2][j+1];
                chars[6] = board[i][j+2];
                chars[7] = board[i + 1][j+2];
                chars[8] = board[i + 2][j+2];
                result = checkIfhasRepeatValue(chars);
                if (!result) return false;
            }
        }
        return result;
    }

    private static boolean checkIfhasRepeatValue(char[] chars) {

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') continue;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) return false;
            }
        }
        return true;
    }

//    [
//            ["5","3",".",".","7",".",".",".","."],
//            ["6",".",".","1","9","5",".",".","."],
//            [".","9","8",".",".",".",".","6","."],
//            ["8",".",".",".","6",".",".",".","3"],
//            ["4",".",".","8",".","3",".",".","1"],
//            ["7",".",".",".","2",".",".",".","6"],
//            [".","6",".",".",".",".","2","8","."],
//            [".",".",".","4","1","9",".",".","5"],
//            [".",".",".",".","8",".",".","7","9"]
//            ]


    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));
    }

}
