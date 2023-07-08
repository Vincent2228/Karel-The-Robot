// SpinBotDemo.java
// Designed to show off the capabilities of a "SpinBot" Object


import becker.robots.*;


public class Karel_5 extends Object
{
	
		public static void main (String [] args) { 
		City square = new City (7, 8);
		SpinBot nancy = new SpinBot (square, 6, 0, Direction.EAST, 0, 4);

		
	
		nancy.move(30);
	}

}






