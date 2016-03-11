package Model;

import java.util.List;

public final class Player {
	private String PlayerName;
	private List<AbstractPiece> pieces;
	
	public Player(String name, List<AbstractPiece> pieces)
	{
		PlayerName = name;
		this.pieces = pieces;
	}
	public List<AbstractPiece> getPieces()
	{
		return pieces;
	}
}
