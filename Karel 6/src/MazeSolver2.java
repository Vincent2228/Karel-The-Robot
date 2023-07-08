import becker.robots.*;


public class MazeSolver2 extends Robot
{

	
	public MazeSolver2 (City c, int s, int a, Direction d, int n)
	{	
		super (c, s, a, d, n);
		this.getDirection();
		this.setSpeed(10);
	}
	
	public void maze()
	{
		while (this.countThingsInBackpack() > 0)
		{
			if (noleftwall() == true)
			{
				this.turnLeft();
				this.move();
				maze();
			}
			else if (noleftwall() == false)
			{
				if (nofrontwall() == false)
				{
					this.turnRight();
					maze();
				}
				else if (nofrontwall() == true)
				{
					this.move();
					maze();
				}
			}
		}
	}
	
	public void move()
	{	
		super.move();
		if (!super.canPickThing() && super.countThingsInBackpack() > 0)
			super.putThing();
	}
	
	public boolean noleftwall()
	{	
		this.turnLeft();
		if (this.frontIsClear() == true)
		{
			this.turnRight();
			return true;
		}
		else
		{
			this.turnRight();
			return false;
		}
		
	}
	
	public boolean nofrontwall()
	{
		if (this.frontIsClear() == true)
			return true;
		else
			return false;
	}
		
	public void turnRight()
	{
		for (int i = 0; i < 3; i++)
			super.turnLeft();
	}
		
	public void move(int steps)
	{
		for (int i = 0; i < steps; i++)
			this.move();
	}
		
	}