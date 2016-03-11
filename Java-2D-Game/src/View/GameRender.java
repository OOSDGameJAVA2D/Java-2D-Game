package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.applet.Applet;

import Model.AbstractPiece;
import Model.Board;
import Model.Piece;
import Model.Player;
import Utils.GlobalVariables;

public class GameRender  implements Render{
	private Graphics graphics;
	private BufferedImage screen;
	
	public GameRender()
	{
		screen = new BufferedImage(GlobalVariables.Height(), GlobalVariables.Width(), BufferedImage.TYPE_INT_RGB);
		graphics = screen.getGraphics();
	}
	public void SetGraphics()
	{
		graphics.setColor(Color.BLUE);
		graphics.fillRect(0, 0, GlobalVariables.Height(), GlobalVariables.Width());
	}
	public BufferedImage getScreen()
	{
		return screen;
	}
	public void arenaSetColor(Color color)
	{
		graphics.setColor(color);
		graphics.fillRect(0, 0, GlobalVariables.Height(), GlobalVariables.Width());
	}
	public void drawBoard(Board board)
	{		

		// Copy from mvc droids Draw //
		
		graphics.setColor(new Color(0, 0.5f, 0, 0.75f));
		for (int i = 0; i <= board.WIDTH; i++) {
			graphics.drawLine(i * GlobalVariables.sizeOfBlock(), 0, i * GlobalVariables.sizeOfBlock(), board.HEIGHT * GlobalVariables.sizeOfBlock());
			if (i <= board.WIDTH)
				graphics.drawLine(0, i * GlobalVariables.sizeOfBlock(), board.WIDTH * GlobalVariables.sizeOfBlock(), i * GlobalVariables.sizeOfBlock());
		}

		// Copy from mvc droids Run //
		renderPieces(board.getPlayer1(), graphics, new Color(0, 1f, 0), new Color(0.7f, 0.5f, 0f));
		renderPieces(board.getPlayer2(), graphics, new Color(0, 0.4f, 0), new Color(0.7f, 0.5f, 0f));
		
		
	}
	
	private void renderPieces(Player player, Graphics graphics, Color colorCenter, Color colorSquare)
	{
		for( AbstractPiece temp :player.getPieces() )
		{
			graphics.setColor(colorCenter);
			int x = (int) (temp.getX() * GlobalVariables.sizeOfBlock());
			int y = (int) (temp.getY() * GlobalVariables.sizeOfBlock());
			graphics.fillOval(x + 2, y + 2, GlobalVariables.sizeOfBlock() - 4, GlobalVariables.sizeOfBlock() - 4);
			graphics.setColor(colorSquare);
			graphics.fillRect(x + 10, y + 10, GlobalVariables.sizeOfBlock() - 20, GlobalVariables.sizeOfBlock() - 20);
		}
	}
	@Override
	public void SelectPiece(Piece a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void MovePiece(Piece a, int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DestroyPiece(Piece a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DeselectPiece(Piece a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ShowRangePiece(Piece a) {
		// TODO Auto-generated method stub
		
	}

}
