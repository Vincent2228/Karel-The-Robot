// SpinBotStressTest.java

import java.util.*;
import becker.robots.*;

public class SpinBotStressTest extends Object
{
	public static City board;
	public static Random g;							// random number generator
	public static ArrayList<Thing> walls;
	public static int maxWalls = 31;
	public static int maxStreets = 8;
	public static int maxAvenues = 8;
	
	public static void main (String [] args)
	{
		board = new City (maxStreets, maxAvenues);
		SpinBot nancy = new SpinBot (board, 7, 3, Direction.NORTH, 0, 0);		

		g = new Random();
		walls = new ArrayList<Thing>();

		createWalls();

		while (nancy.getStreet() != 0)
			nancy.move();

	}
	

	// this method creates the Walls using a random number generator
	public static void createWalls()
	{		
		int a = g.nextInt(maxWalls);
		int avenue, street, dir;

		Direction one = null;

		for (int i = 0; i < a; i++)
		{
			avenue = g.nextInt(maxAvenues);
			street = g.nextInt(maxStreets);
			dir = g.nextInt(4);

			switch (dir)
			{
				case 0:
					one = Direction.NORTH;
					break;

				case 1:
					one = Direction.EAST;					
					break;

				case 2:
					one = Direction.SOUTH;					
					break;

				case 3:
					one = Direction.WEST;					
					break;
			}

			walls.add(new Wall(board, street, avenue, one));
		}

	}
}
