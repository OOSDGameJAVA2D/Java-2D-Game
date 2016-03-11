package Model;

public abstract class AbstractPiece implements Piece {
	private String id;
	private int hitPoints, atackRange, damage, movementRange, actualX, actualY;
	
	public AbstractPiece(String id, int hitPoints, int atackRange, int damage, int movementRange, int initialX, int initialY)
	{	
		this.id = id;
		this.hitPoints = hitPoints;
		this.atackRange = atackRange;
		this.damage = damage;
		this.movementRange = movementRange;
		actualX = initialX;
		actualY = initialY;
	}
	protected boolean MoveCheck(int x, int y)
	{
		if((actualX != x || actualY != y ) && (Math.abs(actualX - x ) <= 1 && Math.abs(actualY - y ) <= 1))
			return true;
		return false;
	}
	protected boolean atackCheck(Piece target)
	{
		if( ( target.getId() != this.id ) )
			return true;
		return false;
	}
	private boolean isOnRange(Piece target)
	{
		if(Math.abs(actualX - target.getX() ) <= atackRange && Math.abs(actualY - target.getY() ) <= atackRange)
			return true;
		return false;		
	}
	protected abstract void specialAtack(AbstractPiece target);
	public String getId()
	{
		return this.id;
	}
	public int getAtackRange()
	{
		return this.atackRange;
	}
	public int getDamage()
	{
		return this.damage;
	}
	public int getMovementRange()
	{
		return this.movementRange;
	}
	public int getLife()
	{
		return this.hitPoints;
	}
	public int getX()
	{
		return this.actualX;
	}
	public int getY()
	{
		return this.actualY;
	}
	public void move(int x, int y)
	{
		if(MoveCheck(x, y))
		{
			actualX = x;
			actualY = y;
		}	
	}
	
}
