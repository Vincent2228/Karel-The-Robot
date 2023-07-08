import becker.robots.*;

public class Test {

	public static void main(String[] args) {
		
		City c = new City();
		RobotoTron r = new RobotoTron(c);
		r.move(5);
		if (r.move("hello") == 0)
			System.out.println("Success");
		
	}

}
