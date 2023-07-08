import becker.robots.*;

public class SpinBotMapLoader
{
	public static void main(String[] args)
	{
		// either specify a file name here, or leave blank for file open dialog box!
		String fileName = "";
		City saved = new City(fileName);
		
		int ave, str, thi, spi;
		Direction dir;

		// parameters for easy adjustment
		ave = 7;
		str = 3;
		dir = Direction.NORTH;
		thi = 0;
		spi = 0;

		SpinBot karel = new SpinBot (saved, ave, str, dir, thi, spi);

		while (karel.getAvenue() != 7)
			karel.move();

	}
}
