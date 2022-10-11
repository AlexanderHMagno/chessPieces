package chess;

public class Rook extends AbstractChessPiece {

    public Rook(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {

        if(!this.outOfBoundary(row,col)) {
            if (this.row == row || this.column == col) {
                return true;
            }
        }

        return false;
    }
}
