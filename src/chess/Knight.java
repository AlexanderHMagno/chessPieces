package chess;

public class Knight extends AbstractChessPiece {

    public Knight(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {

        if(!this.outOfBoundary(row,col)) {

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
