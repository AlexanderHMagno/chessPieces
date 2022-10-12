package chess;

/**
 * This class represents a Position. This position is denoted
 * in cartesian coordinates (x,y) labeled as (column, row)
 */
public class Position {
    private final int row;
    private final int column;


    /**
     * Constructor for Position class, it accepts a row and a column
     * @param row Position Y on a cartesian coordinate axe
     * @param col Position X on a cartesian coordinate axe
     */
    public Position(int row, int col) {
        this.row = row;
        this.column = col;
    }

    /**
     * Obtain the distance between column1 and another column
     * @param column Position X on a cartesian coordinate
     * @return Absolute difference between 2 points in the x cartesian coordinate axe.
     */
    public int absColumnDistance(int column) {
        return Math.abs(this.getColumn() - column);
    }

    /**
     * Obtain the distance between row1 and another row
     * @param row Position Y on a cardinality coordinate
     * @return Absolute difference between 2 points in the Y cartesian coordinate axe.
     */
    public int absRowDistance(int row) {
        return Math.abs(this.getRow() - row);
    }

    /**
     * Check if the new position is in diagonal to the initial one
     * @param other represents another cartesian coordinate
     * @return check if it's a diagonal movement, a non movement will be considered false
     */
    public boolean diagonalMovement (Position other) {
        return (absColumnDistance(other.getColumn()) == absRowDistance(other.getRow()))
                && this.countMagnitudeOfMovement(other) > 0;
    }

    /**
     * Check if the new position is in linear from the initial one
     * @param other represents another cartesian coordinate
     * @return check if it's a linear movement, a non movement will be considered false
     */
    public boolean linearMovement (Position other) {
        return (this.absRowDistance(other.getRow()) == 0 || this.absColumnDistance(other.getColumn()) == 0)
                && this.countMagnitudeOfMovement(other) > 0;
    }

    /**
     * Check if the new Position is in an L formation from the initial position.
     *     Moves in L, sum of row and col difference should be 3
     *     And each Row and Col should move at least 1 space.
     * @param other represents another cartesian coordinate
     * @return check if it's an L movement, a non movement will be considered false
     */

    public boolean lMovement (Position other) {
        return this.absRowDistance(other.getRow()) > 0 &&
                this.absColumnDistance(other.getColumn()) > 0 &&
                this.countMagnitudeOfMovement(other) == 3;
    }

    /**
     * Check if the new Position is in a proximity area  from the initial position.
     *     Moves in proximity, sum of row and col difference should be less or equal than 2
     *     And each Row and Col should move at most 1 space.
     * @param other represents another cartesian coordinate
     * @return check if it's a Proximity movement, a non movement will be considered false
     */
    public boolean proximityMovement (Position other) {
        return (this.absRowDistance(other.getRow()) == 1 || this.absColumnDistance(other.getColumn()) == 1)
                && this.countMagnitudeOfMovement(other) <= 2;
    }

    /**
     * Calculates the total spaces from the other Position and the initial Position.
     * @param other represents another cartesian coordinate
     * @return Number of spaces a pieces moves from initial Position and other Position
     */
    public int countMagnitudeOfMovement(Position other) {
        return this.absRowDistance(other.getRow()) + this.absColumnDistance(other.getColumn());
    }

    /**
     * Finds the direction of the movement in the Y cartesian coordinates axe
     * @param row row to compare the direction of the movement
     *            if its positive the element is moving from top to bottom
     *            if its negative the element is moving from bottom to top
     * @return
     */
    public int getDirection(int row) {
        return this.getRow() - row;
    }

    /**
     * Obtain the Y position in the cartesian coordinate axe.
     * @return Obtain the Y position in the cartesian coordinate axe.
     */
    public int getRow() {
        return row;
    }

    /**
     * Obtain the X position in the cartesian coordinate axe.
     * @return Obtain the X position in the cartesian coordinate axe.
     */
    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
