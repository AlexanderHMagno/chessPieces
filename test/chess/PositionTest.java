package chess;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is the test Class for the position class.
 */
public class PositionTest {

    private Position home;
    private Position cinema;
    private Position university;
    private Position costco;
    private Position parking;
    private Position grocery;
    private Position park;
    private Position hospital;
    private Position museum;

    /**
     * Prepare some instances of Position to test.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        home = new Position(0,0);
        cinema = new Position(14,14);
        university = new Position(0,100);
        costco = new Position(13,12);
        parking = new Position(1,0);

        //negatives
        grocery = new Position(-1,-1);
        park = new Position(-10,0);
        hospital = new Position(-2, -1);
        museum = new Position(9,-9);
    }

    /**
     * Test the distance from initial Column to the other Column
     * Note is an absolute movement
     */
    @Test
    public void testAbsColumnDistance() {
        assertEquals(14,home.absColumnDistance(cinema.getColumn()));
        assertEquals(86,cinema.absColumnDistance(university.getColumn()));
        assertEquals(12,costco.absColumnDistance(parking.getColumn()));

        assertEquals(9,home.absColumnDistance(museum.getColumn()));
        assertEquals(1,home.absColumnDistance(hospital.getColumn()));
        assertEquals(8,grocery.absColumnDistance(museum.getColumn()));
    }

    /**
     * Test the distance from initial row to the other row
     * Note is an absolute movement.
     */
    @Test
    public void absRowDistance() {
        assertEquals(14,home.absRowDistance(cinema.getRow()));
        assertEquals(14,cinema.absRowDistance(university.getRow()));
        assertEquals(12,costco.absRowDistance(parking.getRow()));
        assertEquals(13,university.absRowDistance(costco.getRow()));

        assertEquals(9,home.absRowDistance(museum.getRow()));
        assertEquals(2,home.absRowDistance(hospital.getRow()));
        assertEquals(19,park.absRowDistance(museum.getRow()));
    }

    /**
     * Test if the movement is Diagonal to the initial point.
     */
    @Test
    public void testDiagonalMovement() {
        assertTrue(home.diagonalMovement(cinema));
        assertTrue(home.diagonalMovement(grocery));
    }

    /**
     * Test if the movement is only in one axe
     */
    @Test
    public void testLinearMovement() {
        assertTrue(home.linearMovement(university));
        assertTrue(home.linearMovement(parking));
        assertTrue(home.linearMovement(park));
        assertTrue(grocery.linearMovement(hospital));

    }

    /**
     * Test if the movement moves to block in any axe and 1 block in the other
     */
    @Test
    public void testLMovement() {
        assertTrue(cinema.lMovement(costco));
        assertTrue(costco.lMovement(cinema));
        assertTrue(home.lMovement(hospital));
        assertTrue(hospital.lMovement(home));
    }

    /**
     * Test if the position to move is an adjacent coordinate to the initial one.
     */
    @Test
    public void proximityMovement() {
        assertTrue(home.proximityMovement(parking));
        assertTrue(parking.proximityMovement(home));
        assertTrue(home.proximityMovement(grocery));
    }

    /**
     * Test the number of points from initial position to the end position.
     * Each axe counts as a separate movements, assume diagonal movements sums as 2.
     */
    @Test
    public void countMagnitudeOfMovement() {
        assertEquals(100, home.countMagnitudeOfMovement(university));
        assertEquals(28, home.countMagnitudeOfMovement(cinema));
        assertEquals(25, home.countMagnitudeOfMovement(costco));
        assertEquals(1, home.countMagnitudeOfMovement(parking));
        assertEquals(0, home.countMagnitudeOfMovement(home));
        assertEquals(3, cinema.countMagnitudeOfMovement(costco));

        assertEquals(10, home.countMagnitudeOfMovement(park));
        assertEquals(18, home.countMagnitudeOfMovement(museum));
        assertEquals(118, university.countMagnitudeOfMovement(museum));
        assertEquals(28, cinema.countMagnitudeOfMovement(museum));

    }

    /**
     * Test the direction of the vertical movement in the cartesian Y axe
     */
    @Test
    public void getDirection() {
        assertEquals(-1, home.getDirection(cinema.getRow()));
        assertEquals(1, cinema.getDirection(home.getRow()));
        assertEquals(0, cinema.getDirection(cinema.getRow()));
        assertEquals(-1, costco.getDirection(cinema.getRow()));
        assertEquals(1, cinema.getDirection(costco.getRow()));

        assertEquals(1, museum.getDirection(park.getRow()));
        assertEquals(-1, hospital.getDirection(grocery.getRow()));
        assertEquals(-1, park.getDirection(costco.getRow()));

    }

    /**
     * Test the Get Row Method
     */
    @Test
    public void getRow() {

        assertEquals( 0, home.getRow());
        assertEquals( 14, cinema.getRow());
        assertEquals( 0, university.getRow());
        assertEquals( 13, costco.getRow());
        assertEquals( 1, parking.getRow());
        assertEquals( -1, grocery.getRow());
        assertEquals( -10, park.getRow());
        assertEquals( -2, hospital.getRow());
        assertEquals( 9, museum.getRow());

    }

    /**
     * Test the Get Column Method
     */
    @Test
    public void testGetColumn() {

        assertEquals( 0, home.getColumn());
        assertEquals( 14, cinema.getColumn());
        assertEquals( 100, university.getColumn());
        assertEquals( 12, costco.getColumn());
        assertEquals( 0, parking.getColumn());
        assertEquals( -1, grocery.getColumn());
        assertEquals( 0, park.getColumn());
        assertEquals( -1, hospital.getColumn());
        assertEquals( -9, museum.getColumn());
    }

    /**
     * Test the toString Method with the following format "Position{row=0, column=0}"
     */
    @Test
    public void testToString() {

        assertEquals("Position{row=0, column=0}", home.toString());
        assertEquals("Position{row=14, column=14}" , cinema.toString());
        assertEquals("Position{row=0, column=100}" , university.toString());
        assertEquals("Position{row=13, column=12}" , costco.toString());
        assertEquals("Position{row=1, column=0}" , parking.toString());
    }
}