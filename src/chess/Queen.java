package chess;

/**
 * This class represents a Queen with a row, a column and Color, it extends
 * the AbstractChessPiece Class.
 */
public class Queen extends AbstractChessPiece {

    /**
     * Construct a Queen with a row, a column and Color.
     * @param row Position on the BoardChess from top to bottom starting from 0 to 7
     * @param column Position on the BoardChess from left to right starting from 0 to 7
     * @param color Color can be BLACK or WHITE
     * @throws IllegalArgumentException If position row and column are out of boundary ( 0< pos >7)
     */
    public Queen(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {

        if(super.canMove(row,col)) {
            //The difference between both points should be equal for diagonal movement
            //The row or column should be equal for rook movement
            if (Math.abs(this.row - row) == Math.abs(this.column - col) ||
                    this.row == row || this.column == col
            ) {
                return true;
            }
        }

        return false;

    }
}
