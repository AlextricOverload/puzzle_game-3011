// Tile.java
// puzzle_game-3011
// Last Modified (YYYY-MM-DD): 2026-03-26

package puzzle;

public class Tile {
    private final int[] CORRECT_POS;  // Where the tile should go to win the game

    // Constructor
    public Tile(int row, int col) {
        CORRECT_POS = new int[]{row, col};
    }
    public static void main(String[] args) {}
}
