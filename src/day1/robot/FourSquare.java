package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

import javafx.scene.paint.Color;

public class FourSquare {
	
	// 2. Create a new Robot
	
	Robot iphone= new Robot ();

	void go() {
		// 4. Make the robot move as fast as possible
		iphone.setSpeed(10);

		// 5. Set the pen width to 5
		iphone.setPenWidth(5);
		iphone.penDown();

		// 6. Do steps #7 to #8 four times...
		
		for (int i = 0; i < 8; i++) {
			
		

			// 7. Set the pen color to random
			iphone.setRandomPenColor();
	
			// 1. Call the drawSquare() method
		drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
		iphone.turn(90);

	}}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() { 
		for (int i = 0; i < 4; i++) {
			
		
		iphone.move(100);
		iphone.turn(90);}
		
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
