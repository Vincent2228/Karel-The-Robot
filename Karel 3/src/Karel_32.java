// Karel_32.java
// Coded by: <name> on <date>

import java.util.*;
import becker.robots.*;

public class Karel_32 extends Object
{
	
	public static City board;
	public static Random g;							// random number generator
	public static ArrayList<Thing> walls;
	
	@SuppressWarnings("unused")
	public static void main (String [] args)
	{
		g = new Random();
		walls = new ArrayList<Thing>();
		
		// City and Robot
		board = new City ();		
		MyRobot karel = new MyRobot(board, 5, 0, Direction.EAST, 0);		
		Thing onlyThing = new Thing(board, 5,6);
		
		createWalls();
		
		
		while (karel.canPickThing() == false)
		{
			
			if (karel.frontIsClear() == false)
			{
				karel.turnLeft();
				karel.move();
				
				for (int i = 0; i < 2; i++)
				{
				karel.turnRight(); 
				karel.move();
				}
				
				karel.turnLeft();
			}

			else
				karel.move();
			
		}
		
	}

	
	// this method creates the Walls using a random number generator
	public static void createWalls()
	{		
		int a = 0;

		for (int avenue = 0; avenue < 7; avenue ++)
			walls.add(new Wall(board, 5, avenue, Direction.SOUTH));
			
		for (int avenue = 1; avenue < 6; avenue++)
		{
			a = g.nextInt(2);
			
			if (a == 1)
				walls.add(new Wall(board, 5, avenue, Direction.EAST));				
		}
		
	}
	
}