package chess;

public class Queen extends AbstractChessPiece {

    public Queen(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {
        return false;
    }
}
