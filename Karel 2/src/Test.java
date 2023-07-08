// Karel_1x.java
// Coded by: <name> on <date>

/*
	This file should be the starting point for all programs written for Karel Activity #1. 
	Copy this file to the appropriately named file (ie: Karel_1x.java) and then change the class name.
*/

import becker.robots.*;

//                  .-- program number (change this to a 1, 2, ...)
//                  v
public class Test extends Object
{
	public static void main (String [] args)
	{

		// new City called 'square' and new Robot called 'karel'
		City square = new City ();
		Robot karel = new Robot (square, 0, 0, Direction.SOUTH, 50);
		
		// your program starts below this line
		
		for (int i = 0; i < 7; i++)
		{
		
		for (int a = 0; a < 6; a++)
		{
			if (a == a)
				karel.putThing();
			
			karel.move();

		}
		
		karel.turnLeft();
		
		}
	}
}