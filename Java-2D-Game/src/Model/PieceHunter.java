package Model;

public class PieceHunter extends AbstractPiece {
	
	public PieceHunter(String id, int hitPoints, int atackRange, int damage, int movementRange, int initialX, int initialY)
	{
		super(id, hitPoints, atackRange, damage, movementRange, initialX, initialY);
	}
	@Override
	public void atack(Piece target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void specialAtack(AbstractPiece target) {
		// TODO Auto-generated method stub
		
	}

}
