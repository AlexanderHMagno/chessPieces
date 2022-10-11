package chess;

public class Bishop extends AbstractChessPiece {

    public Bishop(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {
        return false;
    }
}
