package Model;

import java.util.Random;

import Utils.GlobalVariables;

public class Board {
	public static final int WIDTH = GlobalVariables.Height() / GlobalVariables.sizeOfBlock();
	public static final int HEIGHT = GlobalVariables.Width() / GlobalVariables.sizeOfBlock();
	
	private Object[][] blocks;
	private Player player1, player2;
	private String playerName;
	
	public Board(Player player1, Player player2)
	{
		this.player1 = player1;
		this.player2 = player2;
		blocks = new Object[HEIGHT][WIDTH];
		for (int i = 0; i < WIDTH; i++) 
		{
			for (int j = 0; j < HEIGHT; j++) 
			{
				blocks[j][i] = null;
			}
		}		
		
		setPlayerPieces(this.player1);
		setPlayerPieces(this.player2);
		
	}
	public Player getPlayer1()
	{
		return player1;
	}
	public Player getPlayer2()
	{
		return player2;
	}
	private void setPlayerPieces(Player player)
	{
		for(AbstractPiece temp : player.getPieces())
		{
			blocks[temp.getX()][temp.getY()] = temp;
		}
	}

}
