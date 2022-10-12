package chess;

/**
 * This class represents a King with a row, a column and Color, it extends
 * the AbstractChessPiece Class.
 */
public class King extends AbstractChessPiece {

    /**
     * Construct a King with a row, a column and Color.
     * @param row Position on the BoardChess from top to bottom starting from 0 to 7
     * @param column Position on the BoardChess from left to right starting from 0 to 7
     * @param color Color can be BLACK or WHITE
     * @throws IllegalArgumentException If position row and column are out of boundary ( 0< pos >7)
     */
    public King(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {

        if(super.canMove(row,col)) {
            //It has to be moved at least one column or a row
            if (Math.abs(this.row - row) <= 1 && Math.abs(this.column - col) <= 1) {
                return true;
            }
        }

        return false;
    }
}
