// Karel_11.java
// Coded by: Vincent Bercze on 2020/09/28


import becker.robots.*;

//                  .-- program number (change this to a 1, 2, ...)
//                  v
public class Karel_11 extends Object
{
	public static void main (String [] args)
	{

		// new City called 'square' and new Robot called 'karel'
		City square = new City ();
		Robot karel = new Robot (square, 3, 3, Direction.EAST, 0);
		
		// Things placed in the four corners
		Thing x1 = new Thing (square, 0, 0);
		Thing x2 = new Thing (square, 0, 6);
		Thing x3 = new Thing (square, 6, 0);
		Thing x4 = new Thing (square, 6, 6);
		
		
		
		for (int i = 0; i <= 1; i++)
		{
			for (int j = 0; j <= 2; j++)
				karel.move();
			
			karel.turnLeft();
		}
		
		karel.pickThing(); 

		for (int d = 0; d <= 2; d++)
		{
			
		for (int k = 0; k <= 5; k++)
			karel.move();
		
			karel.turnLeft();
			karel.pickThing(); 
			
		}
	
		
		for (int j = 0; j <= 2; j++)
				karel.move();
			
			karel.turnLeft();
			
		for (int j = 0; j <= 2; j++)
				karel.move();
		
		karel.putThing();
	}
}
