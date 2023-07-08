import becker.robots.*;

public class MyRobot extends Robot
{
	// constructor
	public MyRobot (City c, int ave, int street, Direction dir, int numThings)
	{
		super (c, ave, street, dir, numThings);
	}

	// turn around
	public void turnAround ()
	{
		this.turnLeft ();
		this.turnLeft ();
	}

	// drop all the Things
	public void dropLoad ()
	{
		while (this.countThingsInBackpack () > 0)
			this.putThing ();
	}

	// move a certain number of times
	public void move (int distance)
	{
		while (distance > 0)
		{
			this.move ();
			distance--;
		}
	}
		
	// put a Thing and move a certain number of times
	public void dropMove (int times)
	{
		for (int i = 0; i < times; i++)
		{
			putThing ();
			move ();
		}
	}

	// turn right
	public void tR ()
	{
		for (int i = 0; i < 3; i++)
			turnLeft ();
	}

	// position robot at the top of the next column
	public void nextColumn ()
	{
		turnAround ();
		move (7);
		tR ();
		move ();
		tR ();
	}
	
	// draw the letter "A"
	public void drawA ()
	{
		move (2);
		dropMove (5);		
		nextColumn ();
		
		move (1);
		dropMove (1);
		move (2);
		dropMove (1);
		move (2);
		nextColumn ();
		
		for (int i = 0; i < 2; i++)
		{
			dropMove (1);
			move (3);
			dropMove (1);
			move (2);
			nextColumn ();
		}
		
		move (1);
		dropMove (1);
		move (2);
		dropMove (1);
		move (2);
		nextColumn ();
		
		move (2);
		dropMove (5);		
		nextColumn ();		
	}
	
	public void drawT ()
	{
		// code goes here
	}
}