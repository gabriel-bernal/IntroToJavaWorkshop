package day1.robot;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Dog= new Robot ();
		
		// 5. Set your robot's pen to the down position
		Dog.penDown();

		// 3. Set the robot to go at max speed (10)
		Dog.setSpeed (10);
		// 2. Turn the robot 1/3 of 360 degrees to the right
				lol.setPenColor(Color.orange);
		Dog.turn(360/3);
			
		
		// 4. Do the following (steps 6-9) 75 times
		for (int j = 0; j < (600); j++) {
			
		Dog.turn(120);

			// 7. Change the pen color to random
		
	Dog.setPenColor(Color.GREEN);
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
			Dog.move(5*j);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
			
	}
			// 9. Set the pen width to i

	}
}
