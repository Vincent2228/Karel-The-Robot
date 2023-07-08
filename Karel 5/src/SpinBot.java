
//FOR BONUS QUESTION

import java.awt.Color;

import becker.robots.*;


public class SpinBot extends Robot
{

	int spins;
	int bruh = 0;
	int bruh2 = 0;
	Direction dir;
	
	public SpinBot (City c, int s, int a, Direction d, int n, int spinCount)
	{	
		super (c, s, a, d, n);
		this.spins = spinCount;
		this.getDirection();
		this.setSpeed(10);
		dir = d;
	}
	
	//gets avenue/street of spinbot at the beginning instead
	int pathX = this.getStreet();
	int pathY = this.getAvenue();
	int pathX2;
	int pathY2;
	
	public void move()
	{
		if (spins == 0)
		this.setLabel("");
		
		for (int i = 0; i < spins; i++)
		{
			this.setColor(Color.green);
			this.setLabel("Spin: " + (i+1));	
			
			for (int j = 0; j < 4; j++)
				this.turnLeft();
		}
		
		this.setColor(Color.red);
		
		if (this.frontIsClear())
			super.move();
			
		else if (this.frontIsClear() == false)
			dontHitStuffplz();
	}
	
	//first attempted path
	public void dontHitStuffplz()
	{
		
		if (this.frontIsClear() == false)
		this.turnRight();
		
			//right path
			if (this.frontIsClear())
			{
				super.move();
				this.turnLeft();
				
				if (this.frontIsClear())
				{
					super.move();
					this.turnLeft();
					
					if (bruh2 == 1)
					{
						super.move();
						super.move();
						this.turnLeft();
					}
					
					bruh2 = 0;
					
					if (this.frontIsClear() == false)
					{
						this.turnRight();
						
						if (this.frontIsClear() == false)
							dontHitStuffplz();
						
						while (this.frontIsClear())
						{
							super.move();
							this.turnLeft();
							if (this.frontIsClear() == false)
								this.turnRight();
							else
							{
								super.move();
								break;
							}
						}
					}
					
					
					//makes karel end go back to its original avenue
					if ((this.getAvenue() != pathY) && (dir == Direction.NORTH || dir == Direction.SOUTH))
					{
						while (this.getAvenue() != pathY)
						{
							if (this.frontIsClear() == false)
								dontHitStuffplz();
							else 
								super.move();
						}
					}
					
					//makes karel end go back to its original street
					if ((this.getStreet() != pathX) && (dir == Direction.WEST || dir == Direction.EAST))
					{
						while (this.getStreet() != pathX)
						{
							if (this.frontIsClear() == false)
								dontHitStuffplz();
							else 
								super.move();
						}
					}
					
					this.turnRight();
					
					if (this.frontIsClear() == false)
						dontHitStuffplz();
					
					//end
				}
				
				else
				{
					bruh2++;
					this.turnRight();
					dontHitStuffplz();
				}
					
			}
			
			//left path
			else
			{
				this.turnLeft();
				this.turnLeft();
				leftPath();
			}
	}
	
	//in case right is blocked off
	public void leftPath()
	{
		
		if (this.frontIsClear() == false)
			box();
		
		super.move();
		this.turnRight();
		
		if (this.frontIsClear())
		{
			
			super.move();
			this.turnRight();
			
			if (this.frontIsClear() == false)
			{
				this.turnLeft();
				
				while (this.frontIsClear())
				{
					super.move();
					this.turnRight();
					if (this.frontIsClear() == false)
						this.turnLeft();
					else
					{
						super.move();
						break;
					}
				}
				
			}
			
			bruh = 0;
			
			//makes karel end go back to its original avenue
			if ((this.getAvenue() != pathY) && (dir == Direction.NORTH || dir == Direction.SOUTH))
			{
				while (this.getAvenue() != pathY)
				{
					super.move();
					if (this.frontIsClear() == false)
					{
						this.turnLeft();
						bruh++;
						if (this.frontIsClear() == false)
							dontHitStuffplz();
					}
				}
			}
			
			//makes karel end go back to its original street
			else if ((this.getStreet() != pathX) && (dir == Direction.WEST || dir == Direction.EAST))
			{
				while (this.getStreet() != pathX)
				{
					super.move();
					if (this.frontIsClear() == false)
					{
						this.turnLeft();
						bruh++;
						if (this.frontIsClear() == false)
							dontHitStuffplz();
					}
				}
			}
			
			if (bruh == 0)
				this.turnLeft();
			
			if (this.frontIsClear() == false)
				dontHitStuffplz();
			
			//end
		}
		
		else
		{
			this.turnLeft();
			leftPath();
		}
	}
	
	//in case both left and right are blocked off
	public void box()
	{
		pathX2 = this.getStreet();
		pathY2 = this.getAvenue();
		
		this.turnLeft();
		while (this.frontIsClear())
		{
			super.move();
			this.turnRight();
			if (this.frontIsClear() == false)
				this.turnLeft();
			else
			{
				super.move();
				break;
			}
		}
		
		this.turnRight();
		
		if (this.frontIsClear() == false)
		{
			this.turnLeft();
			leftPath();
		}
		
		while (this.frontIsClear())
		{
			super.move();
			if (this.frontIsClear() == false)
			{
				this.turnLeft();
				leftPath();
			}
			else
			{
				super.move();
				this.turnRight();
				if (this.frontIsClear() == false)
					this.turnLeft();
				else
				{
					if (this.getDirection() == Direction.NORTH || this.getDirection() == Direction.SOUTH)
					{
					while (this.getStreet() != pathX2)
					{
						if (this.frontIsClear() == false)
						{
							this.turnLeft();
							super.move();
						}
						
						super.move();
					}
					this.turnLeft();
					break;
					}
					
					
					else if (this.getDirection() == Direction.WEST || this.getDirection() == Direction.EAST)
					{
					while (this.getAvenue() != pathY2)
					{
						if (this.frontIsClear() == false)
						{
							this.turnLeft();
							super.move();
						}
						
						super.move();
					}
					this.turnLeft();
					break;
					}
				}
			}
		}
		
		//end
		
		while(this.frontIsClear())
			super.move();
		
		if(this.frontIsClear() == false)
			dontHitStuffplz();
		
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
	
	public void setSpins (int numTimes)
	{
		spins = numTimes;
	}
	

}