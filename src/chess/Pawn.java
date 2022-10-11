package chess;

public class Pawn extends AbstractChessPiece {

    public Pawn(int row, int column, Color color) throws IllegalArgumentException {
        super(row, column, color);
    }

    @Override
    public boolean canMove(int row, int col) {
        return false;
    }
}
