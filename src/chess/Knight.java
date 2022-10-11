package chess;

public class Knight extends AbstractChessPiece {

    public Knight(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {
        return false;
    }
}
