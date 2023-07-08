import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.util.Random;

public class MazeSolver3 extends Robot
{

	public MazeSolver3 (City c, int s, int a, Direction d, int n)
	{	
		super (c, s, a, d, n);
		this.getDirection();
		this.setSpeed(10);
	}
	
	public void maze()
	{
		while (this.getStreet() != 9 || this.getAvenue() != 9)
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
		Random rand = new Random();
		int rand2 = rand.nextInt(2);
		
		if (rand2 == 1)
		{
		if (!super.canPickThing() && super.countThingsInBackpack() > 0)
			super.putThing();
		}
		
		super.move();
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