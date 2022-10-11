package chess;

public class King extends AbstractChessPiece {

    public King(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {
        return false;
    }
}
