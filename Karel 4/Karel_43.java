import java.awt.Color;
import becker.robots.*;

public class Karel_43 extends Object
{
    public static void main (String [] args)
    {	
		City thorold = new City (7, 11);			// show 6 x 10 city - wider than normal
		
		MyRobot foo = new MyRobot (thorold, 0, 0, Direction.SOUTH, 100);		
		MyRobot bar = new MyRobot (thorold, 0, 6, Direction.SOUTH, 100);
		
		foo.setColor (new Color(100, 50, 200));		// custom colour in (red, green, blue) format
		bar.setColor (Color.MAGENTA);				// built-in colour
		
		foo.drawA ();
    }
}