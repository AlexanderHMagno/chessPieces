package chess;

/**
 * This represents an Abstract ChessPiece with a row, a column and Color,
 * which implements the ChessPiece interface.
 */
public abstract class AbstractChessPiece implements ChessPiece {


    protected final Position position;
    protected final Color color;

    /**
     * Constructor for AbstractChessPiece with a row, a column and Color.
     * @param row Position on the BoardChess from bottom to top starting from 0 to 7
     * @param column Position on the BoardChess from left to right starting from 0 to 7
     * @param color Color can be BLACK or WHITE
     * @throws IllegalArgumentException If position row and column are out of boundary ( 0< pos >7)
     */
    public AbstractChessPiece(int row, int column, Color color) throws IllegalArgumentException {

        //This can be an area to move
        if (this.outOfBoundary(row,column)) {
            throw new IllegalArgumentException("Out of boundaries");
        }
        this.position = new Position(row,column);
        this.color = color;
    }

    @Override
    public int getRow() {
        return this.position.getRow();
    }

    @Override
    public int getColumn() {
        return this.position.getColumn();
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public boolean canKill(ChessPiece piece) {

        //Check is not the same color
        if (this.getColor() == piece.getColor()) {
            return false;
        }

        return this.canMove(piece.getRow(), piece.getColumn());
    }

    @Override
    public boolean canMove(int row, int col){

        //If this Out of boundary or it's the same position
        if(this.outOfBoundary(row,col) || isSamePosition(row,col) ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "{" +
                "row=" + this.getRow() +
                ", column=" + this.getColumn() +
                ", color=" + this.getColor() +
                ", type=" + this.getClass().getSimpleName()+
                '}';
    }

    /**
     * Verify if the position is within the ChessBoard limits
     * @param row Position of the ChessPiece from top to bottom
     * @param col Position of the ChessPiece from left to right
     * @return Checks if the piece is inside the ChessBoard
     */
    private boolean outOfBoundary(int row, int col) {

        if(row < 0 || col < 0 || row > 7 || col > 7) {
            return true;
        }
        return false;
    }

    /**
     * Checks if the position is the same position that the ChessPiece is currently
     * located at
     * @param row Position of the ChessPiece from top to bottom
     * @param col Position of the ChessPiece from left to right
     * @return checks if the new position is the same as the current position
     */
    private boolean isSamePosition(int row, int col) {
        return (this.getRow() == row  && this.getColumn() == col);
    }

    /**
     * Helper function to Check if this piece is white.
     * @return Check if this piece is white.
     */
    protected boolean isWhitePiece () {
        return this.getColor() == Color.WHITE;
    }


}
