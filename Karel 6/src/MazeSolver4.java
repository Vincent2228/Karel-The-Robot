import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.util.Random;

public class MazeSolver4 extends Robot
{
	
	public MazeSolver4 (City c, int s, int a, Direction d, int n)
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
	
	public void maze2()
	{
		while ((this.getStreet() != 0 || this.getAvenue() != 0) || this.countThingsInBackpack() != 20)
		{
			if (noleftwall() == true)
			{
				this.turnLeft();
				this.move2();
				maze2();
			}
			else if (noleftwall() == false)
			{
				if (nofrontwall() == false)
				{
					this.turnRight();
					maze2();
				}
				else if (nofrontwall() == true)
				{
					this.move2();
					maze2();
				}
			}
		}
	}
	
	public void move()
	{	
		Random rand = new Random();
		int rand2 = rand.nextInt(2);
		
		if (rand2 == 0)
		{
			if (!super.canPickThing() && super.countThingsInBackpack() > 0)
				super.putThing();
			
		super.move();
		}
	}
	
	public void move2()
	{
		super.move();
		if (super.canPickThing())
			super.pickThing();
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