package chess;

import static org.junit.Assert.*;

public class ChessPieceTest {

    private ChessPiece pawnBlack1;
    private ChessPiece pawnBlack2;
    private ChessPiece pawnBlack3;
    private ChessPiece knightBlack1;
    private ChessPiece bishopBlack1;
    private ChessPiece rookBlack1;
    private ChessPiece queenBlack1;
    private ChessPiece kingBlack1;

    private ChessPiece pawnWhite1;
    private ChessPiece pawnWhite2;
    private ChessPiece pawnWhite3;
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
        this.pawnBlack3 = new Pawn(3,2, Color.BLACK);
        this.pawnWhite1 = new Pawn(6,0, Color.WHITE);
        this.pawnWhite2 = new Pawn(3,4, Color.WHITE);
        this.pawnWhite3 = new Pawn(1,2, Color.WHITE);

        //Knights
        this.knightBlack1 = new Knight(4,2, Color.BLACK);
        this.knightWhite1 = new Knight(7,7, Color.WHITE);

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
        this.kingWhite1 = new King(5,6, Color.WHITE);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void testOutOfColumn() {
        ChessPiece crazyPiece = new Pawn(0,8, Color.WHITE);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void testOutOfRow () {
        ChessPiece crazyPiece = new Queen(8,3, Color.BLACK);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void testNegativeSetPosition () {
        ChessPiece crazyPiece = new Rook(-2,4, Color.BLACK);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void testInitialBlackPawnPosition () {
        ChessPiece crazyPiece = new Pawn(0,4, Color.BLACK);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void testInitialWhitePawnPosition () {
        ChessPiece crazyPiece = new Pawn(7,4, Color.WHITE);
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
        assertEquals(7,knightWhite1.getRow());
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
        assertEquals(7,knightWhite1.getColumn());
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

        //Black Pawns
        assertTrue(pawnBlack1.canMove(3,3));
        assertTrue(pawnBlack2.canMove(5,6));
        //Black Knight
        assertTrue(knightBlack1.canMove(3,4));
        assertTrue(knightBlack1.canMove(5,0));
        // bishop
        assertTrue(bishopBlack1.canMove(4,4));
        assertTrue(bishopBlack1.canMove(7,7));
        //Black Rook
        assertTrue(rookBlack1.canMove(0,4));
        assertTrue(rookBlack1.canMove(7,0));
        //Black Queen
        assertTrue(queenBlack1.canMove(0,5));
        assertTrue(queenBlack1.canMove(2,1));
        assertTrue(queenBlack1.canMove(7,0));
        assertTrue(queenBlack1.canMove(3,6));
        //Black King
        assertTrue(kingBlack1.canMove(0,6));
        assertTrue(kingBlack1.canMove(1,5));
        assertTrue(kingBlack1.canMove(2,7));

        //Whites
        //Pawns
        assertTrue(pawnWhite1.canMove(4,0));
        assertTrue(pawnWhite1.canMove(5,0));
        assertTrue(pawnWhite2.canMove(2,3));
        //Knights
        assertTrue(knightWhite1.canMove(6,5));
        assertTrue(knightWhite1.canMove(5,6));
        //Bishops
        assertTrue(bishopWhite1.canMove(1,3));
        assertTrue(bishopWhite1.canMove(2,6));
        assertTrue(bishopWhite1.canMove(7,1));
        assertTrue(bishopWhite1.canMove(4,6));
        //Rooks
        assertTrue(rookWhite1.canMove(0,0));
        assertTrue(rookWhite1.canMove(3,7));
        //Queen
        assertTrue(queenWhite1.canMove(2,5));
        assertTrue(queenWhite1.canMove(5,4));
        assertTrue(queenWhite1.canMove(1,3));
        assertTrue(queenWhite1.canMove(4,7));
        //King
        assertTrue(kingWhite1.canMove(4,6));
        assertTrue(kingWhite1.canMove(6,6));
        assertTrue(kingWhite1.canMove(5,7));
        assertTrue(kingWhite1.canMove(6,5));
        assertTrue(kingWhite1.canMove(4,7));
    }

    @org.junit.Test
    public void canMoveFalse() {

        //Blacks
        //Can not move backwards
        assertFalse(pawnBlack1.canMove(1,3));
        assertFalse(pawnBlack2.canMove(3,6));
        //Can not jump if its not first movement
        assertFalse(pawnBlack1.canMove(4,3));
        assertFalse(pawnBlack2.canMove(6,6));

        //Can not move to the right
        assertFalse(knightBlack1.canMove(4,3));
        //Can not get out of the chess board
        assertFalse(bishopBlack1.canMove(8,8));
        assertFalse(bishopBlack1.canMove(0,2));
        //Can not move diagonal
        assertFalse(rookBlack1.canMove(5,6));
        //Can not move in L
        assertFalse(queenBlack1.canMove(4,4));
        //Can not move more than 2
        assertFalse(kingBlack1.canMove(1,4));

        //Whites
        assertFalse(pawnWhite1.canMove(3,6));
        //can not move horizontally
        assertFalse(pawnWhite1.canMove(6,1));
        //Can not move backwards
        assertFalse(pawnWhite2.canMove(4,4));
        //Can not move out of the chessboard
        assertFalse(knightWhite1.canMove(5,8));
        //Can not move vertically
        assertFalse(bishopWhite1.canMove(2,5));
        //Can not move diagonally
        assertFalse(rookWhite1.canMove(7,0));
        //Can not move out of boundary
        assertFalse(queenWhite1.canMove(4,8));
        //Can not move more than 2 diagonally
        assertFalse(kingWhite1.canMove(3,4));
    }

    @org.junit.Test
    public void canKillTrue() {

        //Blacks
        assertTrue(pawnBlack1.canKill(pawnWhite2));
        assertTrue(knightBlack1.canKill(pawnWhite2));
        assertTrue(bishopBlack1.canKill(knightWhite1));
        assertTrue(rookBlack1.canKill(knightWhite1));
        assertTrue(rookBlack1.canKill(pawnWhite2));
        assertTrue(queenBlack1.canKill(rookWhite1));
        assertTrue(queenBlack1.canKill(bishopWhite1));
        assertTrue(queenBlack1.canKill(pawnWhite2));
        assertTrue(queenBlack1.canKill(queenWhite1));
        assertTrue(kingBlack1.canKill(rookWhite1));
        //Whites
        assertTrue(pawnWhite2.canKill(pawnBlack1));
        assertTrue(pawnWhite2.canKill(queenBlack1));
        assertTrue(bishopWhite1.canKill(pawnBlack2));
        assertTrue(rookWhite1.canKill(bishopBlack1));

        assertTrue(queenWhite1.canKill(pawnBlack1));
        assertTrue(queenWhite1.canKill(knightBlack1));
        assertTrue(queenWhite1.canKill(pawnBlack2));
        assertTrue(queenWhite1.canKill(queenBlack1));
        assertTrue(queenWhite1.canKill(kingBlack1));

        assertTrue(kingWhite1.canKill(pawnBlack2));
    }

    @org.junit.Test
    public void canKillFalse() {

        //Blacks
        assertFalse(pawnBlack1.canKill(pawnWhite3));
        assertFalse(pawnBlack2.canKill(kingWhite1));
        assertFalse(knightBlack1.canKill(bishopWhite1));
        assertFalse(bishopBlack1.canKill(rookWhite1));
        assertFalse(rookBlack1.canKill(pawnWhite1));
        assertFalse(queenBlack1.canKill(kingWhite1));
        assertFalse(kingBlack1.canKill(kingWhite1));

        //Whites
        assertFalse(pawnWhite1.canKill(knightBlack1));
        assertFalse(pawnWhite2.canKill(kingBlack1));
        assertFalse(pawnWhite3.canKill(pawnBlack1));
        assertFalse(knightWhite1.canKill(rookBlack1));
        assertFalse(bishopWhite1.canKill(queenBlack1));
        assertFalse(rookWhite1.canKill(kingBlack1));
        assertFalse(queenWhite1.canKill(rookBlack1));
        assertFalse(kingWhite1.canKill(queenBlack1));
    }

    @org.junit.Test
    public void canNotKillSameTeam() {

        //Blacks
        assertFalse(pawnBlack1.canKill(pawnBlack3));
        assertFalse(knightBlack1.canKill(pawnBlack1));
        assertFalse(queenBlack1.canKill(kingBlack1));
        assertFalse(queenBlack1.canKill(pawnBlack1));
        assertFalse(kingBlack1.canKill(queenBlack1));

        //Whites
        assertFalse(pawnWhite2.canKill(queenWhite1));
        assertFalse(knightWhite1.canKill(kingWhite1));
        assertFalse(rookWhite1.canKill(knightWhite1));
        assertFalse(queenWhite1.canKill(pawnWhite2));
    }

    @org.junit.Test
    public void testToString() {
        assertEquals("{row=2, column=3, color=BLACK, type=Pawn}", pawnBlack1.toString());
        assertEquals("{row=4, column=6, color=BLACK, type=Pawn}", pawnBlack2.toString());
        assertEquals("{row=3, column=2, color=BLACK, type=Pawn}", pawnBlack3.toString());
        assertEquals("{row=4, column=2, color=BLACK, type=Knight}", knightBlack1.toString());
        assertEquals("{row=0, column=0, color=BLACK, type=Bishop}", bishopBlack1.toString());
        assertEquals("{row=7, column=4, color=BLACK, type=Rook}", rookBlack1.toString());
        assertEquals("{row=2, column=5, color=BLACK, type=Queen}", queenBlack1.toString());
        assertEquals("{row=1, column=6, color=BLACK, type=King}", kingBlack1.toString());

        assertEquals("{row=6, column=0, color=WHITE, type=Pawn}", pawnWhite1.toString());
        assertEquals("{row=3, column=4, color=WHITE, type=Pawn}", pawnWhite2.toString());
        assertEquals("{row=1, column=2, color=WHITE, type=Pawn}", pawnWhite3.toString());
        assertEquals("{row=7, column=7, color=WHITE, type=Knight}", knightWhite1.toString());
        assertEquals("{row=3, column=5, color=WHITE, type=Bishop}", bishopWhite1.toString());
        assertEquals("{row=0, column=7, color=WHITE, type=Rook}", rookWhite1.toString());
        assertEquals("{row=4, column=3, color=WHITE, type=Queen}", queenWhite1.toString());
        assertEquals("{row=5, column=6, color=WHITE, type=King}", kingWhite1.toString());
    }
}