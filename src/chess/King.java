package chess;

public class King extends AbstractChessPiece {

    public King(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {

        if(!this.outOfBoundary(row,col)) {
            if (Math.abs(this.row - row) <= 1 && Math.abs(this.column - column) <= 1) {
                return true;
            }
        }

        return false;
    }
}
