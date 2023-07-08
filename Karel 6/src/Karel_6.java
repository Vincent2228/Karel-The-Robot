// Karel_6.java

import becker.robots.*;

public class Karel_6 extends Object
{
	
	public static void main (String [] yes)
	{
		// --------------------------------+
		int numStreets = 10;////////////// | DO NOT
		int numAvenues = 10;////////////// | MODIFY
		double twistiness = 1.0;////////// | THESE
		double branchiness = 1.0;///////// | SETTINGS
		// --------------------------------+
		
		MazeCity square = new MazeCity (numStreets, numAvenues, twistiness, branchiness);		
		MazeSolver2 karel = new MazeSolver2 (square, 0, 0, Direction.EAST, 100); //change number of things in backpack
		//change value of MazeSolver from 1-6                                     1 - 0    2 - 100    3 - 20
		//                                                                        4 - 20   5 - 64     6 - 10
		
		if (karel.countThingsInBackpack() == 10)
			karel.putThing();
		
		karel.maze();
		
		//ENABLE only for number 4:
		
		//karel.maze2();
		//while (karel.countThingsInBackpack() > 0)
			//karel.putThing();
		
		
		
	}
	
}