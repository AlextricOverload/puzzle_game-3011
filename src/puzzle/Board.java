package puzzle;

public class Board {
    private final int SIZE;  // Size of the board
    private Tile[][] tiles;  // Tile array for the board
    public Board(int size) {
        SIZE = size;

        // Initialize tiles as a SIZE x SIZE 2D array
        tiles = new Tile[SIZE][SIZE];

        // Create the solved board
        // Loop through each row
        for (int row = 0; row < SIZE; row++) {
            // Loop through each column
            for (int col = 0; col < SIZE; col++) {
                if (col == SIZE-1 && row == SIZE-1) {  // Last tile on the board
                    tiles[row][col] = null;  // Blank tile
                }
                else {  // Tile is not last
                    tiles[row][col] = new Tile(row, col);  // Regular tile
                }
            }
        }
        
    }
    public static void main(String[] args) {}
} 
