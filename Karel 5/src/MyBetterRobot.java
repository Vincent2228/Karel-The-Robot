// MyBetterRobot.java
// Coded by: <name> on <date>

/*
	This file is the on-disk representation of the new Object being created.
	It must contain at least one "constructor" in order to be valid.
	
	Other constructors can be added that match the special functionality of
	this particular Robot object.
*/

import becker.robots.*;

//            .-----------------------------name of this class
//            |                     .------ name of class being extended
//            V                     V
public class MyBetterRobot extends MyRobot
{
	// attributes that define a "MyBetterRobot" (instance variables)
	private static String m1, m2;

	// constructor
	public MyBetterRobot (City c, String msg1, String msg2)
	{
		// ave, street, direction, backpack count all set to zero ALWAYS
		super (c, 0, 0, Direction.EAST, 0);						// call to MyRobot's constructor
		
		m1 = msg1;												// set first message attribute
		m2 = msg2;												// set second message attribute
		System.out.println ("Just created a MyBetterRobot.");	// check the console for this message
	}

	// OVERRIDE the parent's turnAround method (same method name, same number of parameters)
	public void turnAround ()
	{
		this.setLabel (m1);									// show first messasge
		this.turnRight ();									// turn right
		
		this.setLabel (m2);									// show second message
		this.turnRight ();									// turn right
		
		this.setLabel ("");									// hide message
	}

	// new method taken from last assignment
	public void turnRight ()
	{
		for (int i = 0 ; i < 3 ; i++)
			this.turnLeft ();								// turn left 3 times = 1 right turn
	}

	// new method to change the two instance variables that store the messasges displayed during "turnAround()"
	public void changeMessage (String x1, String x2)
	{
		m1 = x1;											// update the first message
		m2 = x2;											// update the second message
	}
}

