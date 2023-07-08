// Karel_25.java
// Coded by: Vincent Bercze on 2020/09/29

import becker.robots.*;

//                  .-- program number (change this to a 1, 2, ...)
//                  v
public class Karel_25 extends Object
{
	
	public static void main (String [] args)
	{

		// new City called 'square' and new Robot called 'karel'
		City square = new City ();
		MyRobot karel = new MyRobot (square, 0, 0, Direction.SOUTH, 49);
		// 7 * 7 = 49
		


		for (int i = 0; i < 7; i++) {
		
		for (int a = 0; a < 6; a++) {
		karel.putThing(); karel.move(); 
		}

		if (karel.getDirection() == Direction.NORTH) { 
		karel.putThing(); karel.turnRight(); karel.move(); karel.turnRight(); 
		}

		else { 
		karel.putThing(); karel.turnLeft(); karel.move(); karel.turnLeft(); 
		}

		}	
		
		
	}

}