// Karel_13.java
// Coded by: Vincent Bercze on 2020/09/28

/*
	This file should be the starting point for all programs written for Karel Activity #1. 
	Copy this file to the appropriately named file (ie: Karel_1x.java) and then change the class name.
*/

import becker.robots.*;

//                  .-- program number (change this to a 1, 2, ...)
//                  v
public class Karel_13 extends Object
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
		
		
		
		//moves Karel into top right corner
		for (int k = 0; k < 2; k++)
		{
			
		for (int i = 0; i < 3; i++)
			karel.move();
		
			karel.turnLeft();
		}
		
		//repeats pattern
		for (int j = 0; j < 4; j++)
		{
			
		karel.pickThing();
		
		for (int c = 0; c < 6; c++)
		{
			if (j == 3 && c == 3)
				karel.turnLeft();
			
				karel.move();		
		}
		
		karel.turnLeft();
		
		}
		
		karel.putThing ();
	}
}