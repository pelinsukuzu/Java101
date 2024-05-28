import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    int row;
    int column;
    String[][] board;
    String[][] mineBoard;
    int mines;
    boolean game = true;
    int uncoveredCount = 0;

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        board = new String[row][column];
        mineBoard = new String[row][column];
        mines = (row * column) / 4;
    }

    public void initialize() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = "-";
                mineBoard[i][j] = "-";
            }
        }
        int count = 0;
        Random random = new Random();
        while (count < mines) {
            int randomRow = random.nextInt(row); // Random row based on the number of rows
            int randomColumn = random.nextInt(column); // Random column based on the number of columns
            if (!Objects.equals(mineBoard[randomRow][randomColumn], "*")) {
                mineBoard[randomRow][randomColumn] = "*";
                count++;
            }
        }
    }

    public boolean isValid(int rowG, int columnG) {
        return rowG >= 0 && rowG < row && columnG >= 0 && columnG < column;
    }

    public boolean isMine(int row, int column) {
        return Objects.equals(mineBoard[row][column], "*");
    }

    public int countAdjacentMines(int row, int column) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if (isValid(i, j) && isMine(i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void run() {
        initialize();

        while (game) {
            printBoard();
            System.out.print("Enter row number: ");
            int row = input.nextInt();
            System.out.print("Enter column number: ");
            int column = input.nextInt();

            if (isValid(row, column)) {
                if (!isMine(row, column)) {
                    board[row][column] = String.valueOf(countAdjacentMines(row, column));
                    uncoveredCount++;
                    if (uncoveredCount == this.row * this.column - mines) {
                        System.out.println("Congratulations! You have found all the mines. You win!");
                        game = false;
                    }
                } else {
                    System.out.println("You hit a mine! Game over.");
                    uncoverAll();
                    printBoard();
                    game = false;
                }
            } else {
                System.out.println("Invalid coordinates! Please try again.");
            }
        }
    }

    public void printBoard() {
        System.out.println("MineSweeper Board:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void uncoverAll() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mineBoard[i][j].equals("*")) {
                    board[i][j] = "*";
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        if (rows < 2 || cols < 2) {
            System.out.println("The number of rows and columns must be at least 2.");
            return;
        }

        MineSweeper game = new MineSweeper(rows, cols);
        game.run();
    }
}

