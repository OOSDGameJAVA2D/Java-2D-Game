package Controller;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import Model.AbstractPiece;
import Model.Board;
import Model.PieceHunter;
import Model.PieceWerewolf;
import Model.Player;
import Utils.GlobalVariables;
import View.GameRender;

public class StarterEngine extends Applet implements Runnable {
	private InputEngine engine;

	public void start() 
	{
		new Thread(this).start();
	}
	public void run() 
	{
		List<AbstractPiece> ListOfPieces = new ArrayList<AbstractPiece>() ;
		for(int i =0;i<4;i++)
		{
			PieceWerewolf Lobo = new PieceWerewolf("ID"+i, i, i, i, i, GlobalVariables.midFieldX()+2-i ,GlobalVariables.initField() );
			ListOfPieces.add(Lobo);
		}
		Player player1 = new Player("player1", ListOfPieces);
		List<AbstractPiece> ListOfPieces2 = new ArrayList<AbstractPiece>() ;
		for(int i =0;i<4;i++)
		{
			PieceHunter Caca = new PieceHunter("IU"+i, i, i, i, i,GlobalVariables.midFieldX()+2-i, GlobalVariables.endFieldY() );
			ListOfPieces2.add(Caca);
		}
		Player player2 = new Player("player2", ListOfPieces2);
		
		Board board = new Board(player1, player2);
		
		
		setSize(GlobalVariables.Height(), GlobalVariables.Width()); // For AppletViewer, remove later.
		Graphics appletGraphics = getGraphics();

		GameRender render = new GameRender();
		
		engine = new InputEngine(render);

		render.SetGraphics();
		// Game loop.
		while (true) {
		
			render.drawBoard(board);
			
			// Draw the entire results on the screen.
			appletGraphics.drawImage(render.getScreen(), 0, 0, null);

				try {
					Thread.sleep(1);
				} catch (Exception e) {
					// It's an interrupted exception, and nobody cares
				
			}

			if (!isActive()) {
				return;
			}
		}
		
		
	}
	public boolean handleEvent(Event e) {
		
		return engine.handleEvent(e);
	}
	
}