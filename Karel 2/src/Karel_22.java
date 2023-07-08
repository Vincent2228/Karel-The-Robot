// Coded by: Vincent Bercze on 2020/09/29


import java.awt.Color;
import becker.robots.*;

//                  .-- program number (change this to a 1, 2, ...)
//                  v
public class Karel_22 extends Object
{
	public static void main (String [] args)
	{
		// City and Robot
		City board = new City ();
		Robot karel = new Robot (board, 3, 3, Direction.EAST, 0);
		
		// Things in the 4 corners
		Thing x1 = new Thing (board, 0, 0);
		Thing x2 = new Thing (board, 0, 6);
		Thing x3 = new Thing (board, 6, 0);
		Thing x4 = new Thing (board, 6, 6);
		
		// Walls (upper left)
		Wall w10 = new Wall (board, 0, 0, Direction.SOUTH);
		Wall w11 = new Wall (board, 0, 1, Direction.SOUTH);
		Wall w12 = new Wall (board, 0, 2, Direction.SOUTH);
		
		// Walls (upper right)
		Wall w20 = new Wall (board, 0, 6, Direction.WEST);
		Wall w21 = new Wall (board, 1, 6, Direction.WEST);
		Wall w22 = new Wall (board, 2, 6, Direction.WEST);
		
		// Walls (lower right)
		Wall w30 = new Wall (board, 6, 6, Direction.NORTH);
		Wall w31 = new Wall (board, 6, 5, Direction.NORTH);
		Wall w32 = new Wall (board, 6, 4, Direction.NORTH);
		
		// Walls (lower left)
		Wall w40 = new Wall (board, 6, 0, Direction.EAST);
		Wall w41 = new Wall (board, 5, 0, Direction.EAST);
		Wall w42 = new Wall (board, 4, 0, Direction.EAST);

		// your program goes here
		
		karel.turnLeft();
		
		//repeats pattern
		for (int i = 0; i < 4; i++)
		{
		
		for (int k = 0; k < 4; k++)
		{
		
		//moves karel 3 blocks	
		for (int a = 0; a < 3; a++)
		{
			karel.move();
		}
		
		//turns karel k times
		for (int b = 0; b <= k; b++)
		{
			karel.turnLeft();
		}
		
		//checks if thing is available for karel to pick up
		if (karel.canPickThing() == true)
		karel.pickThing();
		
		}
		
		//turns karel to the correct position
		karel.turnLeft();

		}

		karel.putThing();
	}
	
}