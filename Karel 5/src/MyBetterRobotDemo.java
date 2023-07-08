// MyBetterRobotDemo.java
// Designed to show off the capabilities of a "MyBetterRobot" Object

import becker.robots.*;

public class MyBetterRobotDemo
{
	public static void main (String [] args)
	{
		City toronto = new City ();
	
		MyBetterRobot Paula = new MyBetterRobot (toronto, "Eat At", "Joe's");		// create a new MyBetterRobot
		MyRobot Loretta = new MyRobot (toronto, 2, 2, Direction.EAST, 0);			// create a new MyRobot

		// run the pattern 6 times
		for (int i = 0 ; i < 6 ; i++)
		{
			Paula.move (5);
			Loretta.move (4);
			
			Paula.turnAround ();
			Loretta.turnAround ();
			
			if (i == 3)																// half way through the routine,
				Paula.changeMessage ("Vote for", "Homer");							// change the "advertisement"
		}
	}
}