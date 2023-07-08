import becker.robots.*;

public class RobotoTron extends Robot
{
	
	
		public RobotoTron(City c)
		{
			super(c, 0,0, Direction.EAST, 0);
		}
		
		
		public void move ()
		{
			System.out.println("MOVE");
			super.move();
		}
		
		public void move(int steps)
		{
			for (int i = 0; i < steps; i++)
				this.move();
		}
		
		public int move (String j)
		{
			super.setLabel(j);
			super.move();
			return this.countThingsInBackpack();
		}
}
