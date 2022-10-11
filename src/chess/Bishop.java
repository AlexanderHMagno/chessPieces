package chess;

public class Bishop extends AbstractChessPiece {

    public Bishop(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {
        //The difference between both points should be equal
        if(!this.outOfBoundary(row,col)) {
            if (Math.abs(this.row - row) == Math.abs(this.column - col)) {
                return true;
            }
        }

        return false;

    }
}
