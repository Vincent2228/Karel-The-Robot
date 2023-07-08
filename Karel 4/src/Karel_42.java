// Karel_4x.java
// Coded by: <name> on <date>

/*
	This file should be the starting point for all programs written for Karel Activity #4. 
	Copy this file to the appropriately named file (ie: Karel_4x.java) and then change the class name.
*/

import java.awt.Color;

import becker.robots.*;

//                  .-- program number (change this to a 1, 2, ...)
//                  v
public class Karel_42 extends Object
{
    public static void main (String [] args) throws InterruptedException
    {
	
		City square = new City ();
		square.showThingCounts (true);		// turn on "ThinkCounts"
		
		//   .-------------------.----- these are references to YOUR object (exists in MyRobot.java) 
		//   v                   v
		MyRobot karel = new MyRobot (square, 1, 1, Direction.EAST, 0);
		
		Thing t;
		for (int i = 0; i < 16; i++)
			t = new Thing(square, 5, 5);
		
		karel.setLabel("EMPTY");
		karel.setColor(Color.MAGENTA);
		
		Wall w50 = new Wall (square, 1, 2, Direction.SOUTH);
		Wall w51 = new Wall (square, 1, 3, Direction.SOUTH);
		Wall w52 = new Wall (square, 1, 4, Direction.SOUTH);
		Wall w53 = new Wall (square, 2, 5, Direction.WEST);
		Wall w54 = new Wall (square, 3, 5, Direction.WEST);
		Wall w55 = new Wall (square, 4, 5, Direction.WEST);
		Wall w56 = new Wall (square, 5, 2, Direction.NORTH);
		Wall w57 = new Wall (square, 5, 3, Direction.NORTH);
		Wall w58 = new Wall (square, 5, 4, Direction.NORTH);
		Wall w59 = new Wall (square, 2, 1, Direction.EAST);
		Wall w5A = new Wall (square, 3, 1, Direction.EAST);
		Wall w5B = new Wall (square, 4, 1, Direction.EAST);
		
		
		for (int i = 0; i < 2; i++)
		{
		karel.move(4);
		karel.turnRight();
		}
			
		karel.pickAllThings();
		karel.setLabel("FULL");
		
		for (int j = 0; j < 16; j++)
		{
		karel.move();
		karel.putThing();
		if (j==3 || j==7 || j==11 || j==15)
			karel.turnRight();
		}
		
		karel.setLabel("DONE");
		Thread.sleep(2000);
		
		karel.turnLeft();
		karel.move();
		
		karel.setLabel("SLEEP");
		karel.setColor(Color.BLACK);
		
    }
}



