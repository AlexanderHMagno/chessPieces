package chess;

public abstract class AbstractChessPiece implements ChessPiece {
    //According to the implementation setting a new position is not contemplated, final row and column.
    protected final int row;
    protected final int column;
    protected final Color color;

    public AbstractChessPiece(int row, int column, Color color) throws IllegalArgumentException {

        //This can be an area to move
        if (this.outOfBoundary(row,column)) {
            throw new IllegalArgumentException("Out of boundaries");
        }

        this.row = row;
        this.column = column;
        this.color = color;
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getColumn() {
        return this.column;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        return false;
    }

    @Override
    public boolean canMove(int row, int col){
        if(this.outOfBoundary(row,col)) {
            return false;
        }
        return true;
    }

    protected boolean outOfBoundary(int row, int column) {

        if(row < 0 || column <0 || row > 7 || column >7) {
            return true;
        }
        return false;
    }
}
