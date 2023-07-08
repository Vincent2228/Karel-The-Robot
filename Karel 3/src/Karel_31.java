// Karel_31.java
// Coded by: <name> on <date>

import becker.robots.*;
import java.awt.Color;	

public class Karel_31 extends Object
{
	
	// in order to 'factor' your code by using methods, you need to declare some objects "globally" outside of the main method.
	// all "global" declarations go here, below the class definition and above the main method.
	public static City board;
	public static MyRobot guard1, guard2, guard3, guard4;

	// this method creates the guards
	public static void createGuards()
	{
		guard2 = new MyRobot (board, 1, 3, Direction.EAST, 0);
		guard3 = new MyRobot (board, 3, 5, Direction.SOUTH, 0);
		guard4 = new MyRobot (board, 5, 3, Direction.WEST, 0);
		guard1 = new MyRobot (board, 3, 1, Direction.NORTH, 0);
	}
	
	@SuppressWarnings("unused")	
	// this method creates the walls
	public static void createWalls()
	{		
		// Walls (upper left)
		Wall w10 = new Wall (board, 1, 1, Direction.NORTH);
		Wall w11 = new Wall (board, 1, 1, Direction.EAST);
		Wall w12 = new Wall (board, 1, 1, Direction.SOUTH);
		Wall w14 = new Wall (board, 1, 1, Direction.WEST);

		// Walls (upper right)
		Wall w20 = new Wall (board, 1, 5, Direction.NORTH);
		Wall w21 = new Wall (board, 1, 5, Direction.EAST);
		Wall w22 = new Wall (board, 1, 5, Direction.SOUTH);
		Wall w24 = new Wall (board, 1, 5, Direction.WEST);

		// Walls (lower left)
		Wall w30 = new Wall (board, 5, 1, Direction.NORTH);
		Wall w31 = new Wall (board, 5, 1, Direction.EAST);
		Wall w32 = new Wall (board, 5, 1, Direction.SOUTH);
		Wall w34 = new Wall (board, 5, 1, Direction.WEST);

		// Walls (lower right)
		Wall w40 = new Wall (board, 5, 5, Direction.NORTH);
		Wall w41 = new Wall (board, 5, 5, Direction.EAST);
		Wall w42 = new Wall (board, 5, 5, Direction.SOUTH);
		Wall w44 = new Wall (board, 5, 5, Direction.WEST);
		
		// Walls (inside)
		Wall w50 = new Wall (board, 2, 2, Direction.NORTH);
		Wall w51 = new Wall (board, 2, 3, Direction.NORTH);
		Wall w52 = new Wall (board, 2, 4, Direction.NORTH);
		Wall w53 = new Wall (board, 2, 4, Direction.EAST);
		Wall w54 = new Wall (board, 3, 4, Direction.EAST);
		Wall w55 = new Wall (board, 4, 4, Direction.EAST);
		Wall w56 = new Wall (board, 4, 2, Direction.SOUTH);
		Wall w57 = new Wall (board, 4, 3, Direction.SOUTH);
		Wall w58 = new Wall (board, 4, 4, Direction.SOUTH);
		Wall w59 = new Wall (board, 2, 2, Direction.WEST);
		Wall w5A = new Wall (board, 3, 2, Direction.WEST);
		Wall w5B = new Wall (board, 4, 2, Direction.WEST);
	}
	
	
	public static void main (String [] args)
	{
		// City and Robot
		board = new City ();
			
		createWalls();							// call the custom method below
		createGuards();							// call the custom method below
		
		guard1.setColor(Color.RED);
		guard2.setColor(Color.GREEN);
		guard3.setColor(Color.BLUE);
		guard4.setColor(Color.PINK);
		
		Thread G1 = new Thread()
		{
		    public void run() 
			{
				while(true)
				{
				if (guard1.frontIsClear() == false)
				{

					guard1.turnLeft();
					guard1.move();
					
					for (int i = 0; i < 3; i++)
					{
						
					guard1.turnRight();
					guard1.move();
					if (i==2)
						break;
					guard1.move();
					
					}
					
					guard1.turnLeft();
				}
				
				else
					guard1.move();
				
				}
			}		
		};

		Thread G2 = new Thread()
		{
		    public void run() 
			{
				while(true)
				{
				if (guard2.frontIsClear() == false)
				{

					guard2.turnLeft();
					guard2.move();
					
					for (int i = 0; i < 3; i++)
					{
						
					guard2.turnRight();
					guard2.move();
					if (i==2)
						break;
					guard2.move();
					
					}
					
					guard2.turnLeft();
				}
				
				else
					guard2.move();
				
				}
			}		
		};
		
		Thread G3 = new Thread()
		{
		    public void run() 
			{
				while(true)
				{
				if (guard3.frontIsClear() == false)
				{

					guard3.turnLeft();
					guard3.move();
				
					for (int i = 0; i < 3; i++)
					{
						
					guard3.turnRight();
					guard3.move();
					if (i==2)
						break;
					guard3.move();
					
					}
					
					guard3.turnLeft();
				}
				
				else
					guard3.move();
				
				}
			}		
		};
		
		Thread G4 = new Thread()
		{
		    public void run() 
			{
				while(true)
				{
				if (guard4.frontIsClear() == false)
				{

					guard4.turnLeft();
					guard4.move();
					
					for (int i = 0; i < 3; i++)
					{
						
					guard4.turnRight();
					guard4.move();
					if (i==2)
						break;
					guard4.move();
					
					}
					
					guard4.turnLeft();
				}
				
				else
					guard4.move();
				
				}
			}		
		};
		
		G1.start();
		G2.start();
		G3.start();
		G4.start();

	}
}