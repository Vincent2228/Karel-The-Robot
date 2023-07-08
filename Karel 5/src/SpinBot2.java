  
//FOR KAREL 5

import java.awt.Color;

import becker.robots.*;


public class SpinBot2 extends Robot
{

	int spins;
	
	public SpinBot2 (City c, int s, int a, Direction d, int n, int spinCount)
	{	
		super (c, s, a, d, n);
		this.spins = spinCount;
		this.getDirection();
		this.setSpeed(20);
	}
	
	int pathX;
	int pathY;
	
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
		{
			//obtains the avenue of spinbot when it encounters a wall
			pathY = this.getAvenue();
			dontHitStuffplz();
		}
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
					
					if (this.frontIsClear() == false)
					{
						this.turnRight();
						
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
					
					//only makes karel go back to its original avenue (as karel only travels up in this case)
					while (this.getAvenue() != pathY)
					{
						if (this.frontIsClear() == false)
							dontHitStuffplz();
						else 
							super.move();
					}
					
					this.turnRight();
					
					if (this.frontIsClear() == false)
						dontHitStuffplz();
					
					//end
				}
				
				else
				{
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
		//turn around
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
			
			//makes karel end go back to its original avenue
			while (this.getAvenue() != pathY)
			{
				if (this.frontIsClear() == false)
					dontHitStuffplz();
				else 
					super.move();
			}
			
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
		
		//end
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