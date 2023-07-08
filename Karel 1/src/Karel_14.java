// Karel_14.java
// Coded by: Vincent Bercze on 2020/09/28

/*
	This file should be the starting point for all programs written for Karel Activity #1. 
	Copy this file to the appropriately named file (ie: Karel_1x.java) and then change the class name.
*/

import becker.robots.*;

//                  .-- program number (change this to a 1, 2, ...)
//                  v
public class Karel_14 extends Object
{
	public static void main (String [] args)
	{

		// new City called 'square' and new Robot called 'karel'
		City square = new City ();
		
		Robot karen = new Robot (square, 2, 2, Direction.WEST, 0);
		// NORTH WEST, SOUTH EAST
		
		Robot karel = new Robot (square, 3, 3, Direction.EAST, 0);
		// NORTH EAST, SOUTH WEST

		
		// Things placed in the four corners
		Thing x1 = new Thing (square, 0, 0);
		Thing x2 = new Thing (square, 0, 6);
		Thing x3 = new Thing (square, 6, 0);
		Thing x4 = new Thing (square, 6, 6);	
		
		
		
		for (int j = 0; j < 3; j++)
			karel.move();
		
		for (int k = 0; k < 2; k++)
			karen.move();
		
		karel.turnLeft();
		
		for (int t = 0; t < 3; t++)
			karen.turnLeft();
		
		for (int d = 0; d < 3; d++)
			karel.move();
		
		for (int z = 0; z < 2; z++)
			karen.move();
		
		karel.turnLeft();
	
		for (int b = 0; b < 3; b++)
			karen.turnLeft();
		
		for (int a = 0; a < 2; a++)
		{	
		
			karel.pickThing();
			karen.pickThing();
			
		for (int q = 0; q < 6; q++)
		{
			karel.move();
			karen.move();
		}
		
		karel.turnLeft();
		
		for (int x = 0; x < 3; x++)
			karen.turnLeft();
		
		for (int m = 0; m < 6; m++)
		{
			karel.move();
			karen.move();
		}
		
		karel.turnLeft();
		
		for (int p = 0; p < 3; p++)
			karen.turnLeft();
		
		}
		
		for (int y = 0; y < 2; y++)
		{
			
		for (int r = 0; r < 3; r++)
			karel.move();
		
			karel.turnLeft();
		}
		
		
		for (int f = 0; f < 2; f++)
			karen.move();
		
		for (int s = 0; s < 3; s++)
			karen.turnLeft();
		
		for (int n = 0; n < 2; n++)
			karen.move();
		
		karel.putThing();
		karen.putThing();
	}
}