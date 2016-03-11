package Utils;

import Model.AbstractPiece;

public class GlobalVariables {
	
	public final static int Height()
	{
		return 960;
	}
	public final static int Width()
	{
		return 960;
	}
	public final static int sizeOfBlock()
	{
		return 32;
	}
	public final static int midFieldX()
	{
		return Width()/(2*sizeOfBlock());
	}
	public final static int initField()
	{
		return 0;
	}
	public final static int endFieldY()
	{
		return (Height()-sizeOfBlock())/sizeOfBlock();
	}
	
	
}