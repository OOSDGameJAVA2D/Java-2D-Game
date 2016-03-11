package Model;

public interface Piece {

	public String getId();
	public int getAtackRange();
	public int getDamage();
	public int getMovementRange();
	public int getLife();
	public int getX();
	public int getY();
	public void atack( Piece target );
	public void move(int x, int y);
	
	
}
