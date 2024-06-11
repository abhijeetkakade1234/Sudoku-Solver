
import java.util.Arrays;

public class SudokuGrid {
    private int[][] grid;

    /**
     * Constructor to initialize the Sudoku grid.
     * Initializes the grid to a default 9x9 empty grid.
     */
    public SudokuGrid() {
        // Initialized the grid to a 9x9 array filled with zeros 
        grid = new int[9][9];
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                grid[row][col] = 0;
            }
        }
    }

    /**
     * Sets the initial state of the Sudoku grid.
     * @param grid A 9x9 integer array representing the initial Sudoku puzzle.
     */
    public void setGrid(int[][] grid) {
        // Validate the input grid (should be 9x9)
        if (grid.length != 9 || grid[0].length != 9) {
            throw new IllegalArgumentException("Invalid grid size");
        }
        // Copy the input grid to the class's grid attribute
        this.grid = Arrays.copyOf(grid, grid.length);
    }

    /**
     * Returns the current state of the Sudoku grid.
     * @return A 9x9 integer array representing the current grid.
     */
    public int[][] getGrid() {
        //  Return the grid attribute
        return grid;
    }

    /**
     * Solves the Sudoku puzzle using a backtracking algorithm.
     * @return True if a solution is found, false otherwise.
     */
    public boolean solve() {
        // Call solveRecursive starting from the first cell (0, 0)
        // Return the result of solveRecursive
        return solveRecursive(0, 0);
    }

    /**
     * Checks if placing a number in a specific cell is valid.
     * @param row The row index of the cell.
     * @param col The column index of the cell.
     * @param num The number to place in the cell.
     * @return True if placing num in grid[row][col] is valid, false otherwise.
     */
    private boolean isValid(int row, int col, int num) {
        // Check if num is already in the specified row
        for(int i = 0; i < 9; i++) {
            if(grid[i][col] == num) return false;
            }
        // Check if num is already in the specified column
        for (int i = 0; i < 9; i++) {
            if(grid[row][i] == num) return false;
        }
        // Check if num is already in the 3x3 subgrid
        int rowStart = row - row % 3;
        int colStart = col - col % 3;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(grid[rowStart + i][colStart + j] == num) return false;
            }
        }
        return true;
    }

    /**
     * Recursive function to solve the Sudoku puzzle.
     * @param row The row index to start from.
     * @param col The column index to start from.
     * @return True if the Sudoku is solved, false if backtracking is required.
     */
    private boolean solveRecursive(int row, int col) {
        // Check if we have reached the end of the grid (row == 9)
        if (row == 9) return true; // Base case: all cells are filled
        // TODO: If col == 9, move to the next row and reset col to 0
        // TODO: If the current cell is not empty (not 0), move to the next cell
        // TODO: Try placing numbers 1-9 in the current cell
        // TODO: For each number, check if it is valid using isValid
        // TODO: If valid, place the number and call solveRecursive for the next cell
        // TODO: If solveRecursive returns true, return true
        // TODO: If no number is valid, reset the cell to 0 (backtrack) and return false
        return false;
    }
}
