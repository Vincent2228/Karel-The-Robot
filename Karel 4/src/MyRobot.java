// MyRobot.java
// Coded by: <name> on <date>

/*
	This file is the on-disk representation of the new Object being created.
	It must contain at least one "constructor" in order to be valid.
	
	Other constructors can be added that match the special functionality of
	this particular Robot object.
*/

import becker.robots.*;

//                            .------ name of the Class/Object being extended
//                            this
public class MyRobot extends Robot
{
	// this is the MyRobot constructor (identical parameters to an existing parent Robot constructor).
	public MyRobot (City c, int ave, int street, Direction dir, int numThings)
	{
		super (c, ave, street, dir, numThings);				// 'super' refers to the parent objects. 
	}

	// new capability - turn 180 degrees (no parameters)
	public void turnAround ()
	{
		this.turnLeft ();									// 'this' refers to THIS object
		this.turnLeft ();
	}
	
	public void turnRight()
	{
		this.turnLeft ();									
		this.turnLeft ();
		this.turnLeft ();
	}
	// new capability - drop all Things in your backpack (no parameters)
	public void dropLoad ()
	{
		while (this.countThingsInBackpack () > 0)
			this.putThing ();
	}

	// new capability - move 'distance' steps (one parameter, an integer value called 'distance')
	public void move (int distance)
	{
		while (distance > 0)
		{
			this.move ();
			distance--;
		}
	}
	
	public void pickAllThings()
	{
		while (this.canPickThing())
		{
			this.pickThing();
		}
	}
	
	public void letterV()
	{
		for (int i = 0; i < 6; i++)
		{
			this.putThing();
			this.move();
		}
		
		this.turnLeft();
		this.move();
		this.putThing();
		this.move();
		this.turnRight();
		this.move();
		this.putThing();
		this.turnLeft();
		this.turnLeft();
		this.move();
		this.turnRight();
		this.move();
		this.putThing();
		this.move();
		this.turnLeft();
		this.move();
		
		for (int i = 0; i < 6; i++)
		{
			this.putThing();
			this.move();
		}
	}
	
	public void letterB()
	{
		for (int k = 0; k < 7; k++)
		{
			this.putThing();
			this.move();
		}
		
		this.putThing();
		this.turnLeft();
		this.move();
		
		for (int a = 0; a < 2; a++)
		{
			
		for (int i2 = 0; i2 < 3; i2++)
		{
			this.putThing();
			this.move();
		}
		
		this.turnLeft();
		
		for (int k2 = 0; k2 < 7; k2++)
		{
			if (k2 == 3)
				this.turnLeft();
			
			this.putThing();
			this.move();
		}
		
		
		for (int n = 0; n < 2; n++)
		{
		this.turnRight();
		this.move();
		}
		
		}
	}
}