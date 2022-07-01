package board;

public abstract class Piece {
	protected int currentRow;
	protected int currentCol;
	protected Board board;

	public Piece(Board b, int row, int col) {
		board = b;
		currentRow = row;
		currentCol = col;
	}
	public abstract boolean legalMove(int newRow, int newCol);
}
