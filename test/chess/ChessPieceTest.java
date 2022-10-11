package chess;

import static org.junit.Assert.*;

public class ChessPieceTest {

    private ChessPiece pawnBlack1;
    private ChessPiece pawnBlack2;
    private ChessPiece knightBlack1;
    private ChessPiece bishopBlack1;
    private ChessPiece rookBlack1;
    private ChessPiece queenBlack1;
    private ChessPiece kingBlack1;

    private ChessPiece pawnWhite1;
    private ChessPiece pawnWhite2;
    private ChessPiece knightWhite1;
    private ChessPiece bishopWhite1;
    private ChessPiece rookWhite1;
    private ChessPiece queenWhite1;
    private ChessPiece kingWhite1;

    @org.junit.Before
    public void setUp() throws Exception {

        //Pawns
        this.pawnBlack1 = new Pawn(2,3, Color.BLACK);
        this.pawnBlack2 = new Pawn(4,6, Color.BLACK);
        this.pawnWhite1 = new Pawn(6,0, Color.WHITE);
        this.pawnWhite2 = new Pawn(3,4, Color.WHITE);

        //Knights
        this.knightBlack1 = new Knight(4,2, Color.BLACK);
        this.knightWhite1 = new Knight(6,0, Color.WHITE);

        //Bishops
        this.bishopBlack1 = new Bishop(0,0, Color.BLACK);
        this.bishopWhite1 = new Bishop(3,5, Color.WHITE);

        //Rooks
        this.rookBlack1 = new Rook(7,4, Color.BLACK);
        this.rookWhite1 = new Rook(0,7, Color.WHITE);

        //Queens
        this.queenBlack1 = new Queen(2,5, Color.BLACK);
        this.queenWhite1 = new Queen(4,3, Color.WHITE);

        //Kings
        this.kingBlack1 = new King(1,6, Color.BLACK);
        this.kingBlack1 = new King(5,6, Color.WHITE);
    }

    @org.junit.Test
    public void getRow() {
        //Blacks
        assertEquals(2,pawnBlack1.getRow());
        assertEquals(4,pawnBlack2.getRow());
        assertEquals(4,knightBlack1.getRow());
        assertEquals(0,bishopBlack1.getRow());
        assertEquals(7,rookBlack1.getRow());
        assertEquals(2,queenBlack1.getRow());
        assertEquals(1,kingBlack1.getRow());
        //Whites
        assertEquals(6,pawnWhite1.getRow());
        assertEquals(3,pawnWhite2.getRow());
        assertEquals(6,knightWhite1.getRow());
        assertEquals(3,bishopWhite1.getRow());
        assertEquals(0,rookWhite1.getRow());
        assertEquals(4,queenWhite1.getRow());
        assertEquals(5,kingWhite1.getRow());
    }

    @org.junit.Test
    public void getColumn() {
        //Blacks
        assertEquals(3,pawnBlack1.getColumn());
        assertEquals(6,pawnBlack2.getColumn());
        assertEquals(2,knightBlack1.getColumn());
        assertEquals(0,bishopBlack1.getColumn());
        assertEquals(4,rookBlack1.getColumn());
        assertEquals(5,queenBlack1.getColumn());
        assertEquals(6,kingBlack1.getColumn());
        //Whites
        assertEquals(0,pawnWhite1.getColumn());
        assertEquals(4,pawnWhite2.getColumn());
        assertEquals(0,knightWhite1.getColumn());
        assertEquals(5,bishopWhite1.getColumn());
        assertEquals(7,rookWhite1.getColumn());
        assertEquals(3,queenWhite1.getColumn());
        assertEquals(6,kingWhite1.getColumn());
    }

    @org.junit.Test
    public void getColor() {

        //Blacks
        assertEquals(Color.BLACK,pawnBlack1.getColor());
        assertEquals(Color.BLACK,pawnBlack2.getColor());
        assertEquals(Color.BLACK,knightBlack1.getColor());
        assertEquals(Color.BLACK,bishopBlack1.getColor());
        assertEquals(Color.BLACK,rookBlack1.getColor());
        assertEquals(Color.BLACK,queenBlack1.getColor());
        assertEquals(Color.BLACK,kingBlack1.getColor());
        //Whites
        assertEquals(Color.WHITE,pawnWhite1.getColor());
        assertEquals(Color.WHITE,pawnWhite2.getColor());
        assertEquals(Color.WHITE,knightWhite1.getColor());
        assertEquals(Color.WHITE,bishopWhite1.getColor());
        assertEquals(Color.WHITE,rookWhite1.getColor());
        assertEquals(Color.WHITE,queenWhite1.getColor());
        assertEquals(Color.WHITE,kingWhite1.getColor());
    }

    @org.junit.Test
    public void canMoveTrue() {

        //Blacks
        assertTrue(pawnBlack1.canMove(0,0));
        assertTrue(pawnBlack2.canMove(0,0));
        assertTrue(knightBlack1.canMove(0,0));
        assertTrue(bishopBlack1.canMove(0,0));
        assertTrue(rookBlack1.canMove(0,0));
        assertTrue(queenBlack1.canMove(0,0));
        assertTrue(kingBlack1.canMove(0,0));
        //Whites
        assertTrue(pawnWhite1.canMove(0,0));
        assertTrue(pawnWhite2.canMove(0,0));
        assertTrue(knightWhite1.canMove(0,0));
        assertTrue(bishopWhite1.canMove(0,0));
        assertTrue(rookWhite1.canMove(0,0));
        assertTrue(queenWhite1.canMove(0,0));
        assertTrue(kingWhite1.canMove(0,0));
    }

    @org.junit.Test
    public void canMoveFalse() {

        //Blacks
        assertFalse(pawnBlack1.canMove(0,0));
        assertFalse(pawnBlack2.canMove(0,0));
        assertFalse(knightBlack1.canMove(0,0));
        assertFalse(bishopBlack1.canMove(0,0));
        assertFalse(rookBlack1.canMove(0,0));
        assertFalse(queenBlack1.canMove(0,0));
        assertFalse(kingBlack1.canMove(0,0));
        //Whites
        assertFalse(pawnWhite1.canMove(0,0));
        assertFalse(pawnWhite2.canMove(0,0));
        assertFalse(knightWhite1.canMove(0,0));
        assertFalse(bishopWhite1.canMove(0,0));
        assertFalse(rookWhite1.canMove(0,0));
        assertFalse(queenWhite1.canMove(0,0));
        assertFalse(kingWhite1.canMove(0,0));
    }

    @org.junit.Test
    public void canKillTrue() {

        //Blacks
        assertTrue(pawnBlack1.canKill(pawnBlack1));
        assertTrue(pawnBlack2.canKill(pawnBlack1));
        assertTrue(knightBlack1.canKill(pawnBlack1));
        assertTrue(bishopBlack1.canKill(pawnBlack1));
        assertTrue(rookBlack1.canKill(pawnBlack1));
        assertTrue(queenBlack1.canKill(pawnBlack1));
        assertTrue(kingBlack1.canKill(pawnBlack1));
        //Whites
        assertTrue(pawnWhite1.canKill(pawnBlack1));
        assertTrue(pawnWhite2.canKill(pawnBlack1));
        assertTrue(knightWhite1.canKill(pawnBlack1));
        assertTrue(bishopWhite1.canKill(pawnBlack1));
        assertTrue(rookWhite1.canKill(pawnBlack1));
        assertTrue(queenWhite1.canKill(pawnBlack1));
        assertTrue(kingWhite1.canKill(pawnBlack1));
    }

    @org.junit.Test
    public void canKillFalse() {

        //Blacks
        assertFalse(pawnBlack1.canKill(pawnBlack1));
        assertFalse(pawnBlack2.canKill(pawnBlack1));
        assertFalse(knightBlack1.canKill(pawnBlack1));
        assertFalse(bishopBlack1.canKill(pawnBlack1));
        assertFalse(rookBlack1.canKill(pawnBlack1));
        assertFalse(queenBlack1.canKill(pawnBlack1));
        assertFalse(kingBlack1.canKill(pawnBlack1));
        //Whites
        assertFalse(pawnWhite1.canKill(pawnBlack1));
        assertFalse(pawnWhite2.canKill(pawnBlack1));
        assertFalse(knightWhite1.canKill(pawnBlack1));
        assertFalse(bishopWhite1.canKill(pawnBlack1));
        assertFalse(rookWhite1.canKill(pawnBlack1));
        assertFalse(queenWhite1.canKill(pawnBlack1));
        assertFalse(kingWhite1.canKill(pawnBlack1));
    }
}