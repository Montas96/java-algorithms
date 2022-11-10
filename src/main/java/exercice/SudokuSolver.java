package exercice;

public class SudokuSolver {

    private static final int GIG_SIZE = 9;

    public static void main(String[] args) {
        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };

        boolean isBoardSolved = solveBoard(board);
        if (isBoardSolved) {
            System.out.println("board Solved");
            for (int i = 0; i < GIG_SIZE; i++) {
                if (i % 3 == 0) {
                    System.out.println("*********");
                }
                for (int j = 0; j < GIG_SIZE; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        }

    }

    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < GIG_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < GIG_SIZE; i++) {
            if (board[column][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int number, int column, int row) {

        int localRowBoxIndex = row - row % 3;
        int localColumnBoxIndex = column - column % 3;

        for (int i = localRowBoxIndex; i < localRowBoxIndex + 3; i++) {
            for (int j = localColumnBoxIndex; j < localColumnBoxIndex + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
        return !isNumberInRow(board, number, row)
                && !isNumberInColumn(board, number, column)
                && !isNumberInBox(board, number, column, row);
    }

    private static boolean solveBoard(int[][] board) {
        for (int row = 0; row < GIG_SIZE; row++) {
            for (int column = 0; column < GIG_SIZE; column++) {
                if (board[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry < GIG_SIZE - 1; numberToTry++) {
                        if (isValidPlacement(board, numberToTry, row, column)) {
                            board[row][column] = numberToTry;
                            if (solveBoard(board)) {
                                return true;
                            } else {
                                board[row][column] = 0;
                            }
                        } else {
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}

