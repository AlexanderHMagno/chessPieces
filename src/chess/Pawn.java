package chess;

/**
 * This class represents a Pawn with a row, a column and Color, it extends
 * the AbstractChessPiece Class.
 */
public class Pawn extends AbstractChessPiece {
    /**
     * Construct a Pawn with a row, a column and Color.
     * @param row Position on the BoardChess from bottom to top starting from 0 to 7
     * @param column Position on the BoardChess from left to right starting from 0 to 7
     * @param color Color can be BLACK or WHITE
     * @throws IllegalArgumentException If position row and column are out of boundary ( 0< pos >7)
     * Or if the White Pawn is set at row 0 or Black Pawn is set at row 7.
     */
    public Pawn(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);

        if(this.isWhitePiece() && row < 1 || !this.isWhitePiece() && row > 6) {
            throw new IllegalArgumentException("Pawn can not be inserted in the first row");
        }
    }

    @Override
    public boolean canMove(int row, int col) {

        if(super.canMove(row,col)) {

            int absDiff = this.position.absRowDistance(row);
            boolean equalColumn = this.getColumn() == col;

            //Only First Movement allows 2 rows, other movements max 1 row.
            if (equalColumn && this.correctDirection(row) &&
                    (this.firstMovement() && absDiff <=2 || absDiff == 1)) {
                    return true;
            }
        }
        return false;
    }


    @Override
    public boolean canKill(ChessPiece piece) {

        //Check is not your team
        if(this.getColor() == piece.getColor()) {
            return false;
        }

        //To kill it needs to move exactly 1 row and 1 column
        if (this.position.absRowDistance(piece.getRow()) == 1 &&
                this.position.absColumnDistance(piece.getColumn()) == 1 &&
                this.correctDirection(piece.getRow())
        ) {
            return true;
        }
        return false;
    }


    /**
     *  Verify if the pawns is still in the first movement of if its has been already moved.
     * @return Checks if the pawn has already been played.
     */
    private boolean firstMovement(){

        //Check if this is the first movement
        if (!this.isWhitePiece() && this.getRow() == 6 || this.isWhitePiece() && this.getRow() == 1) {
            return true;
        }
        return false;
    }



    /**
     * Check if the Pawn is moving in the correct direction
     *       If Blacks, the direction must be positive (row1 - row2) > 0
     *       If Whites, the direction must be negative (row1 - row2) < 0
     * @param row the new position comparing in the chessBoard to compare with the current one
     * @return Check if the Pawn is moving in the correct direction.
     */
    private boolean correctDirection(int row) {

        int diff = this.position.getDirection(row);
        return (!this.isWhitePiece() && diff > 0 || this.isWhitePiece() && diff < 0);
    }
}
