import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SudokuGrid sudokuGrid = new SudokuGrid();

        System.out.println("Enter the initial Sudoku grid (use 0 for empty cells):");
        int[][] initialGrid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                initialGrid[i][j] = scanner.nextInt();
            }
        }
        sudokuGrid.setGrid(initialGrid);

        // Solve the Sudoku puzzle
        if (sudokuGrid.solve()) {
            int[][] solution = sudokuGrid.getGrid();
            // Print or display the solution
        } else {
            System.out.println("No solution exists.");
        }

        scanner.close();
    }
}
