// KarelDemo.java

import becker.robots.*;     												// allows Karel (and friends) to be used

public class KarelDemo extends Object										// must extend 'Object' to work
{
    @SuppressWarnings("unused")
	public static void main (String[] args)
    {
		// every Karel program should have these 3 lines shown below
		City NiagaraFalls = new City ();    								// create a new "City" object called 'NiagaraFalls'
		Robot karel = new Robot (NiagaraFalls, 0, 0, Direction.EAST, 0);   	// create a new "Robot" object, named 'Karel', with parameters (in city 'NiagaraFalls', at location (0,0), facing EAST, with 0 objects in his backpack)
		
		// List of "Thing"s
		Thing theThing = new Thing (NiagaraFalls, 0, 3);                    // create a new "Thing" object, named 'theThing' at (0,3)
	
		/*
			Karel's World:
			
			x = avenue
			y = street
			
			(x, y) = (avenue, street) in Karel's notation
			
			 +---------> (x) co-ordinate increases to the right
			 |
			 |
			 |
			 \/
			(y)
			co-oridinate 
			increases 
			downward
		*/

		for (int i = 0; i < 3; i++)
		{
			karel.move ();			// move Karel once
		}

		karel.pickThing (); 	// pick up a "Thing" object

		karel.turnLeft ();		// turn Karel 90 degrees counter-clockwise
		karel.turnLeft ();		// turn Karel 90 degrees counter-clockwise
		karel.turnLeft ();		// turn Karel 90 degrees counter-clockwise
		
		karel.move ();
		karel.move ();
		karel.putThing ();  	// drop off a "Thing" object
		
		karel.move ();
		karel.move ();
				
    }
}