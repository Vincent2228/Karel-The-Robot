
//Karel_Threaded.java

import becker.robots.*;
import java.awt.Color;

public class Karel_43 implements Runnable						
{
	public static City Thorold;										
	public static MyRobot V, B;
	public static Thing a, b, c, d;


 public void run() 
	{
		V.letterV();
	}
			

 public static void main(String args[]) 
	{
		Thorold = new City();										
		V = new MyRobot(Thorold,0,0,Direction.SOUTH,50);			
		B = new MyRobot(Thorold,0,6,Direction.SOUTH,50);			
		
		V.setColor(Color.BLUE);									
		B.setColor(Color.GREEN);
	
     (new Thread(new Karel_43())).start();					
		
     B.letterB();

     
	}
}
