package Controller;

import java.awt.Color;
import java.awt.Event;

import View.GameRender;

public class InputEngine {
	/** handle the Event passed from the main applet **/
	GameRender render;
	
	public InputEngine(GameRender render)
	{
		this.render = render;
	} 
	public boolean handleEvent(Event e) {
		switch (e.id) {
		case Event.KEY_PRESS:

			render.arenaSetColor(Color.WHITE);
			break;
		case Event.KEY_ACTION:
			// key pressed
			break;
		case Event.KEY_RELEASE:
			// key released
			break;
		case Event.MOUSE_DOWN:
			// mouse button pressed
			break;
		case Event.MOUSE_UP:
			// mouse button released
			render.arenaSetColor(Color.BLACK);
			break;
		case Event.MOUSE_MOVE:
			// mouse is being moved
			break;
		case Event.MOUSE_DRAG:
			// mouse is being dragged (button pressed)
			break;
		}
		return false;
	}
}
