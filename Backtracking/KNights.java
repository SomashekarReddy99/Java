package Backtracking;

public class KNights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        Nights(board, 0, 0, 3); // Placing 4 knights
    }

    static void Nights(boolean[][] board, int row, int col, int Knights) {
        if (Knights == 0) {
            Display(board); // Print the board if all knights are placed
            System.out.println();
            return;
        }

        // If out of bounds (row exceeds the board size)
        if (row == board.length) {
            return;
        }

        // Move to next row if the column exceeds the board length
        if (col == board.length) {
            Nights(board, row + 1, 0, Knights); // Move to the next row
            return;
        }

        // Place the knight if it's safe
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            Nights(board, row, col + 1, Knights - 1); // Recur to place the next knight
            board[row][col] = false; // Backtrack
        }

        // Explore the next column without placing the knight
        Nights(board, row, col + 1, Knights);
    }

    // Display the board with knight positions
    static void Display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                if (cell) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    // Check if the knight can be placed at (row, col)
    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check all 8 possible positions where the knight could attack from
        if (isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        }
        if (isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) {
            return false;
        }
        if (isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        }
        if (isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        }
        if (isValid(board, row + 1, col + 2) && board[row + 1][col + 2]) {
            return false;
        }
        if (isValid(board, row + 1, col - 2) && board[row + 1][col - 2]) {
            return false;
        }
        if (isValid(board, row + 2, col + 1) && board[row + 2][col + 1]) {
            return false;
        }
        if (isValid(board, row + 2, col - 1) && board[row + 2][col - 1]) {
            return false;
        }
        return true;
    }

    // Check if the position (row, col) is within the board boundaries
    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && col >= 0 && row < board.length && col < board.length;
    }
}
