package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Model.Board;
import Model.Piece;

public interface Render {
	public void drawBoard(Board board);
	public void SetGraphics();
	public BufferedImage getScreen();
	public void arenaSetColor(Color color);
	public void SelectPiece( Piece a);
	public void MovePiece( Piece a, int x, int y );
	public void DestroyPiece( Piece a);
	public void DeselectPiece( Piece a);
	public void ShowRangePiece( Piece a);
}
