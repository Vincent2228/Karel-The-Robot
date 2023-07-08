// Karel_4x.java
// Coded by: <name> on <date>

/*
	This file should be the starting point for all programs written for Karel Activity #4. 
	Copy this file to the appropriately named file (ie: Karel_4x.java) and then change the class name.
*/

import becker.robots.*;

//                  .-- program number (change this to a 1, 2, ...)
//                  v
public class Karel_41 extends Object
{
    public static void main (String [] args)
    {
	
		City square = new City ();
		square.showThingCounts (true);		// turn on "ThinkCounts"
		
		//   .-------------------.----- these are references to YOUR object (exists in MyRobot.java) 
		//   v                   v
		MyRobot karel = new MyRobot (square, 1, 1, Direction.EAST, 0);
		
		Wall w1 = new Wall (square, 1, 3, Direction.SOUTH);
		Wall w2 = new Wall (square, 1, 2, Direction.SOUTH);
		
		Wall w3 = new Wall (square, 2, 1, Direction.EAST);
		Wall w4 = new Wall (square, 3, 1, Direction.EAST);
		
		Wall w5 = new Wall (square, 4, 3, Direction.NORTH);
		Wall w6 = new Wall (square, 4, 2, Direction.NORTH);
		
		Wall w7 = new Wall (square, 2, 4, Direction.WEST);
		Wall w8 = new Wall (square, 3, 4, Direction.WEST);
		
		
		while (true)
		{
			karel.move(3);
			karel.turnRight();
		}
		
    }
}



