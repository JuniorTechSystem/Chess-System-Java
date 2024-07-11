package chess;

import boardgame.Position;

public class ChessPosition {
	private char column;
	private int row;
	
	
	public ChessPosition(char column, int row) {
		if (column <  'a' || row < 1  || row > 8) {
			throw new ChessException("Enter instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}




	public char getColumn() {
		return column;
	}


	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	protected ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getColumn());
	}
	@Override
	public String toString() {
		return "" + column + row;
	}

	
	

}
