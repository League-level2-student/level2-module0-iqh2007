package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] r = new Robot[5];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot();
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		int x = 150;
		int y = 500;

		for (int i = 0; i < r.length; i++) {
			x += 100;
			r[i].moveTo(x, y);
		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random random1 = new Random(50);
		int n = random1.nextInt(51);
		
		for (int i = 0; i < r.length; i++) {
			n+= random1.nextInt(51);
			r[i].move(n);
		}

	}
}
