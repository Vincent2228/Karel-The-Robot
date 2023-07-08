// Karel_33.java
// Coded by: <name> on <date>

import java.awt.Color;
import java.util.*;
import becker.robots.*;

public class Karel_33 extends Object
{
	
	public static City board;
	public static Random g;							// random number generator
	public static ArrayList<Thing> things;
	
	@SuppressWarnings("unused")
	public static void main (String [] args)
	{
		g = new Random();
		things = new ArrayList<Thing>();
		
		// City and Robot
		board = new City ();
		board.showThingCounts(true);				// show how many Things are on a certain intersection
		
		MyRobot karel = new MyRobot(board, 0, 1, Direction.SOUTH, 0);		
		karel.setColor(Color.MAGENTA);
		
		createThings();
	
		// your program goes here
		
		while (karel.getStreet() != 6) 	
		{
			
		while (karel.canPickThing() == false)
			karel.move();
		
		while (karel.canPickThing())
			karel.pickThing();
		
		int num  = karel.countThingsInBackpack();
				
		karel.turnLeft();
				
		for (int i = 0; i < num; i++)
		{
			karel.putThing();
			karel.move();
		}		
		
		karel.turnAround();
		
		for (int j = 0; j < num; j++)
			karel.move();
		
		karel.turnLeft();
		karel.move();
		
		}

	}

	
	// this method creates the Thing "piles" using a random number generator
	public static void createThings()
	{		
		int n = 0;
		
		for (int street = 1; street < 6; street++)
		{
			n = g.nextInt(6) + 1;
						
			for (int i = 0; i < n; i++)
				things.add(new Thing(board,street,1));				
		}
	}
	
}