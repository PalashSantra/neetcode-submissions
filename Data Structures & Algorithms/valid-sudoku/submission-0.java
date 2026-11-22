class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rows;
        Set<Character> columns;
        Set<Character> squares;
        for (int i=0;i<9;i++) {
            rows = new HashSet<>();
            columns = new HashSet<>();
            for (int j=0;j<9;j++) {
                if (board[i][j]!='.' && !rows.add(board[i][j])==true) {
                    return false;
                }
                if (board[j][i]!='.' && !columns.add(board[j][i])==true) {
                    return false;
                }

            }
        }
        for (int square = 0; square < 9; square++) {
            squares = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col]!='.' && !squares.add(board[row][col])==true) {
                        return false;
                    }
                }
            }
        }        
        return true;
    }
}
