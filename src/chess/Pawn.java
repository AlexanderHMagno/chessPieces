package chess;

public class Pawn extends AbstractChessPiece {
    public Pawn(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    private boolean firstMovement(){

        //Check if this is the first movement
        if (this.color == Color.WHITE && this.row == 6 ||
                this.color == Color.BLACK && this.row == 1) {
            return true;
        }

        return false;

    }
    @Override
    public boolean canMove(int row, int col) {

        if(!this.outOfBoundary(row,col)) {

            int diff = this.row - row;
            int absDiff = Math.abs(diff);

            //Only First Movement allows 2 rows, other movements max 1 row.
            if ((this.firstMovement() && absDiff <=2 || absDiff == 1)) {
                //If whites, the direction must be positive (x1 - x2) > 0
                //If whites, the direction must be negative (x1 - x2) < 0
                if(this.color == Color.WHITE && diff > 0 ||
                        this.color == Color.BLACK && diff < 0
                ) {
                    return true;
                }
            }





            if(this.firstMovement() && row <= 2  ) {

            }
        }

        return false;
    }
}
