package chess;

public class Queen extends AbstractChessPiece {

    public Queen(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {

        //The difference between both points should be equal for diagonal movement
        //The row or column should be equal for rook movement
        if(!this.outOfBoundary(row,col)) {
            if (Math.abs(this.row - row) == Math.abs(this.column - col) ||
                    this.row == row || this.column == col
            ) {
                return true;
            }
        }

        return false;


    }
}
