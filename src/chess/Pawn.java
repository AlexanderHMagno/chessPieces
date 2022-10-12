package chess;

/**
 * This class represents a Pawn with a row, a column and Color, it extends
 * the AbstractChessPiece Class.
 */
public class Pawn extends AbstractChessPiece {
    /**
     * Construct a Pawn with a row, a column and Color.
     * @param row Position on the BoardChess from top to bottom starting from 0 to 7
     * @param column Position on the BoardChess from left to right starting from 0 to 7
     * @param color Color can be BLACK or WHITE
     * @throws IllegalArgumentException If position row and column are out of boundary ( 0< pos >7)
     * Or if the White Pawn is set at row 7 or Black Pawn is set at row 0.
     */
    public Pawn(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);

        if(this.getColor() == Color.WHITE && row < 1 || this.getColor() == Color.BLACK && row > 6) {
            throw new IllegalArgumentException("Pawn can not be inserted in the first row");
        }

    }


    @Override
    public boolean canMove(int row, int col) {

        if(super.canMove(row,col)) {

            int diff = this.getRow() - row;
            int absDiff = Math.abs(diff);
            boolean equalColumn = this.getColumn() == col;

            //Only First Movement allows 2 rows, other movements max 1 row.
            if (equalColumn && (this.firstMovement() && absDiff <=2 || absDiff == 1)) {
                //If Blacks, the direction must be positive (x1 - x2) > 0
                //If whites, the direction must be negative (x1 - x2) < 0
                if(this.color == Color.BLACK && diff > 0 ||
                        this.color == Color.WHITE && diff < 0
                ) {
                    return true;
                }
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

        int diff = this.row - piece.getRow();
        int absDiffRow = Math.abs(diff);
        int absDiffCol = Math.abs(this.getColumn() - piece.getColumn());

        //To kill it needs to move exactly 1 row and 1 column
        if ((absDiffRow == 1 && absDiffCol == 1 )) {
            //If Blacks, the direction must be positive (x1 - x2) > 0
            //If Whites, the direction must be negative (x1 - x2) < 0
            if(this.color == Color.BLACK && diff > 0 ||
                    this.color == Color.WHITE && diff < 0
            ) {
                return true;
            }
        }

        return false;
    }


    /**
     *  Verify if the pawns is still in the first movement of if its has been already moved.
     * @return Checks if the pawn has already been played.
     */
    private boolean firstMovement(){

        //Check if this is the first movement
        if (this.color == Color.BLACK && this.row == 6 ||
                this.color == Color.WHITE && this.row == 1) {
            return true;
        }

        return false;
    }
}
