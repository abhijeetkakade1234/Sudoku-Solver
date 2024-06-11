import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
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
            if (sudokuGrid.solve()) 
            {
                @SuppressWarnings("unused")
                int[][] solution = sudokuGrid.getGrid();
                // Print or display the solution
                for (int row = 0; row < 9; row++) 
                {
                    if (row % 3 == 0 && row != 0) 
                    {
                        System.out.println("-----------|-----------|-----------");
                    }
                    for (int col = 0; col < 9; col++) 
                    {
                        if (col % 3 == 0 && col != 0) 
                        {
                            System.out.print(" | ");
                        }
                        System.out.print(solution[row][col]);
                    }
                    System.out.println();
                }
            } 
            else 
                System.out.println("No solution exists.");
        }
    }
}
