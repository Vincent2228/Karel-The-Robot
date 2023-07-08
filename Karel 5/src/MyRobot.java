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
//                            V
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
}