package chess;

/**
 * This class represents a Knight with a row, a column and Color, it extends
 * the AbstractChessPiece Class.
 */
public class Knight extends AbstractChessPiece {

    /**
     * Construct a Knight with a row, a column and Color.
     * @param row Position on the BoardChess from top to bottom starting from 0 to 7
     * @param column Position on the BoardChess from left to right starting from 0 to 7
     * @param color Color can be BLACK or WHITE
     * @throws IllegalArgumentException If position row and column are out of boundary ( 0< pos >7)
     */
    public Knight(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {

        if(super.canMove(row,col)) {
            //Moves in L, sum of row and col difference should be 3
            //And each Row and Col should move at least 1 space.
            int rowMove = Math.abs(this.row - row);
            int columnMove = Math.abs(this.column - col);
            int groupMovement = rowMove + columnMove;

            if (rowMove > 0 && columnMove > 0 && groupMovement == 3) {
                return true;
            }
        }

        return false;

    }
}
